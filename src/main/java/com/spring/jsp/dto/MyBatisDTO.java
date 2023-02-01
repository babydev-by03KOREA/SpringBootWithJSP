package com.spring.jsp.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = {"id"})
public class MyBatisDTO {
	private String name;
	private String id;
	private Integer age;
}
