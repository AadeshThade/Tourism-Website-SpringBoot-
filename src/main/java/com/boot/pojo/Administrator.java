package com.boot.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn
public class Administrator extends UserLogin{
	private String name;
	private float salary;
}
