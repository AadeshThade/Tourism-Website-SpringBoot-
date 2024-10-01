package com.boot.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Inheritance(strategy = InheritanceType.JOINED)
@Data
@Entity
public class UserLogin {
	@Id
	@Column(length = 15)
	String loginId;
	@Column(length = 15, nullable = false)
	String pass;
}
