package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.pojo.Hotel;
//import com.boot.pojo.Hotels;

public interface HotelsDao extends JpaRepository<Hotel, Integer> {
	public List<Hotel> findByName(String name);
}
