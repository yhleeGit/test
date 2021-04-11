package com.epe.center.controller.guide;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Member {

	@Id @GeneratedValue
	private Long id;
	private String name;
	
}
