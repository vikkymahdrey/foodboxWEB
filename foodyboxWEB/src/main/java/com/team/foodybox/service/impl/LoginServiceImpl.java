package com.team.foodybox.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.foodybox.dao.AdminUserDao;
import com.team.foodybox.dao.LoginDao;
import com.team.foodybox.domain.AdminUser;
import com.team.foodybox.services.LoginService;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Autowired
	private AdminUserDao adminUserDao;
	
	public AdminUser getLoginUser(String username, String password)	throws Exception {
		
		return loginDao.getLoginUser(username,password);
	}

		public AdminUser getUserByEmail(String email) throws Exception {
			return loginDao.getUserByEmail(email);
	}

			
		public String getPasswordResetMessage(AdminUser admin) throws Exception {
			return "Hi "
					+admin.getDisplayname()				
					+",<br/><br/>Your Password has been reset. To access thefoodybox use the below information.<br/><br/> "
					+ ".<br/><br/>"
					+"Link - <a href='http://thefoodybox.com/foodyboxWEB/'>thefoodybox.com</a>"
					+"<br/><br/>Login Id - "+admin.getLoginId()
					+"<br/><br/>Password - "+admin.getPassword()
					+"<br/><br/>Regards,<br/>" 
					+ "<a href='http://thefoodybox.com/foodyboxWEB/'>http://thefoodybox.com/foodyboxWEB/</a>\n"
							+"  Foodybox Team"
							+"</a>"+"<br/>---------------<br/> <i><u>Note:</u> This is a system generated email. Please do not reply.</i>";
		
			
		}

	
		public AdminUser setGeneratedPwd(AdminUser adminUser) throws Exception {
			return (AdminUser)adminUserDao.save(adminUser);
		}

	
		public AdminUser getUserById(String id) throws Exception {
			return loginDao.getUserById(id);
		}

}
