package com.boot.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Payment {
	@Id
	private int transactionId;
	@Column(length = 30)
	private String fullName;
	@Column(length = 30)
	private String emailId;
	private long phnNo;
	private String address;
	private double totalAmt;
}
