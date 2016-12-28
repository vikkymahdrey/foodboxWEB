package com.team.foodybox.controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team.foodybox.domain.Viewer;
import com.team.foodybox.notification.SendMail;
import com.team.foodybox.notification.SendMailFactory;
import com.team.foodybox.services.AdminService;

@Controller
public class LoginController {
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value= {"/"})
	public String defaultURL(Map<String,Object> map) throws Exception{
		String visitorCount=adminService.getVisitorCount();
		logger.debug("No. Of Visitor"+visitorCount);
		map.put("visitorCount", visitorCount);
		return "admin";
	}
	
	@RequestMapping(value= {"/enquirySubmission"},method=RequestMethod.POST)
	public String enquireFormHandler(HttpServletRequest req,RedirectAttributes redirectAttributes) throws Exception {
		logger.debug("IN Enquire Form");
		String name=req.getParameter("nameId");
		String email=req.getParameter("emailId");
		String msg=req.getParameter("msg");
		String contactNo=req.getParameter("contactId");
		
		Viewer viewer=new Viewer();
		viewer.setName(name);
		viewer.setEmail(email);
		viewer.setMessage(msg);
		viewer.setCreatedDt(new Date(System.currentTimeMillis()));
		if(contactNo!=null && !contactNo.isEmpty()){
			viewer.setContactNo(contactNo);
		}
		
		Viewer viewers=null;
			viewers=adminService.save(viewer);
						
			if(viewers!=null){
				String message = adminService.getMessageTemplate(viewers);
				 SendMail mail = SendMailFactory.getMailInstance();
				try{
				String subject = "Foodybox";
				mail.send(viewers.getEmail(), subject, message);
				redirectAttributes.addFlashAttribute("status",
						"<div class='success'>Query submitted successfully</div");
				}catch(Exception ex){
					logger.error("System Error,",ex);
				}
			}
		
		return "redirect:/";
	}
	
	
	@RequestMapping(value= {"/visitor"})
	public String viewVisitorHandler(Map<String,Object> map) throws Exception {
		List<Viewer> viewerList=adminService.getViewer();
			map.put("viewer", viewerList);
				return "viewer";
	}

			
}
