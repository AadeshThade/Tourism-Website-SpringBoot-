package com.boot.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Activities {

	@Id
	private String activity;
	private String image;
	private int destId;
}
