package com.team.foodybox.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.foodybox.dao.AdminDAO;
import com.team.foodybox.domain.Viewer;
import com.team.foodybox.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO adminDAO;
	
	public Viewer save(Viewer viewer) throws Exception {
		return adminDAO.save(viewer);
	}

	
	public String getMessageTemplate(Viewer viewers) throws Exception {
		return "Hi "
				+viewers.getName()				
				+",<br/><br/>Your query for foodybox has been received. To access foodybox use the below information.<br/><br/> "
				+ ".<br/><br/>"
				+"Link - <a href='http://thefoodybox.com/'>Foodybox</a>"
				+"<br/><br/>Regards,<br/>" 
				+ "<a href='http://thefoodybox.com/'>http://thefoodybox.com/</a>\n"
						+" Foodybox Team."
						+"</a>"+"<br/>---------------<br/> <i><u>Note:</u> This is a system generated email. Please do not reply.</i>";
	
		
	}


	
	public List<Viewer> getViewer() throws Exception {
		return (List<Viewer>) adminDAO.getViewer();
	}


	
	public String getVisitorCount() throws Exception {
		Object visitar=adminDAO.getVisitorCount();
		return String.valueOf(visitar);
	}

	
}
