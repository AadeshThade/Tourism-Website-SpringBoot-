

package com.boot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EmailTransfer {
	@Id
	private String toEmail;
	private String body;
	private String subject;
}
