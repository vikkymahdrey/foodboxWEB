package com.team.foodybox.dao;

import com.team.foodybox.domain.AdminUser;

public interface LoginDao {

	AdminUser getLoginUser(String username, String password) throws Exception;

	AdminUser getUserByEmail(String email) throws Exception;

	AdminUser setPassword(AdminUser adminUser)throws Exception;

	AdminUser getUserById(String id)throws Exception;

}
