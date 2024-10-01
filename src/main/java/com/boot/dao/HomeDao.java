package com.boot.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.pojo.Home;
public interface HomeDao extends JpaRepository<Home, Integer>{
	
}
