package com.team.foodybox.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team.foodybox.domain.AdminUser;

public interface AdminUserDao extends JpaRepository<AdminUser, Integer>{

}
