package com.boot.pojo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Home {
	@Id
	private int homeId;
	@Column(length = 30)
	private String title;
	private String description;
	private String image;
}
