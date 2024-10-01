package com.boot.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Hotel {

	@Id
	@GeneratedValue
	private int hotelId;
	@Column(length = 30)
	private String name;
	@Column(length = 30)
	private String location;
	private String description;
	private String image;
	private double price;
	private int members;
	private int destId;
	
}
