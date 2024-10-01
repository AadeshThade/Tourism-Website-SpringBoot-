package com.boot.pojo; 

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
@Data
@Entity
@PrimaryKeyJoinColumn
public class Customer extends UserLogin{
	@Column(length = 15)
	private String firstname;
	@Column(length = 15)
	private String lastname;
	@Column(length = 15)
	private Date dob;
	@Column(length = 15)
	private String gender;
	private long mobNo;
	@Column(length = 30)
	private String emailId;
	@Column(length = 50)
	private String address;
}
