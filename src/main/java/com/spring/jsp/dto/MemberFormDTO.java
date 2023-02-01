package com.spring.jsp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberFormDTO {
	private String name;
	private String email;
	private String password;
	private String address;
	
	public MemberFormDTO(String name, String email, String password, String address) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
	}
}
