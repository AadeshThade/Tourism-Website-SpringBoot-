package com.boot.pojo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pay {
	@Id
//	private int transactionId;
	@Column(length = 30)
	private String fullName;
	@Column(length = 30)
	private String emailId;
	private long mobNo;
	private String addr;
	private double totalAmt;
	@Column(length = 16)
	private long cardNumber;
	private Date expiryDate;
	@Column(length = 3)
	private int cvv;
	@Column(length = 30, nullable=false)
	private String nameonCard;
}
