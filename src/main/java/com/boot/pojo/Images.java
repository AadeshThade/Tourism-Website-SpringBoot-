package com.boot.pojo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Embeddable
public class Images {

	@Id
	private String first;
	private String second;
	private String third;
	private String fourth;
}
