package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.pojo.Customer;

public interface CustomerDao extends JpaRepository<Customer, String>{

}
