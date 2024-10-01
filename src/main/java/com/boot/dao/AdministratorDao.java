package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.pojo.Administrator;

public interface AdministratorDao extends JpaRepository<Administrator, String>{
	
}
