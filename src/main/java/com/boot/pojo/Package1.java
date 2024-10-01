package com.boot.pojo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Embeddable
public class Package1 {

	@Id
	private String name;
	private String image;
	private int members;
	
	
}
