package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.pojo.Customer;
import com.boot.pojo.UserLogin;

public interface UserLoginDao extends JpaRepository<UserLogin, String>{
	
	public UserLogin findByLoginIdAndPass(String loginId, String pass);
}
