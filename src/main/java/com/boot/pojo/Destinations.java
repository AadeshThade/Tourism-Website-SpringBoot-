package com.boot.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Destinations {
	@Id
	@GeneratedValue
	private int destId;
	@Column(length = 30)
	private String name;
	@Column(length = 30)
	private String location;
	private String description;
	private String image;
	

}
