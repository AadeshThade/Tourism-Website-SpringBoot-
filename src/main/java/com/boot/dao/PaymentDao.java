package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.pojo.Payment;

public interface PaymentDao extends JpaRepository<Payment, Integer>{

}
