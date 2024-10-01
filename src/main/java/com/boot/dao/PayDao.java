package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.pojo.Pay;

public interface PayDao extends JpaRepository<Pay, String>{

}
