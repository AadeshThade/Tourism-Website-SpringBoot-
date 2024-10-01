package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.boot.pojo.Destination;
import com.boot.pojo.Destinations;

public interface DestinationDao extends JpaRepository<Destinations, Integer> {
	public List<Destinations> findByName(String name);
	public List<Destinations> findByDestId(int destId);
}
