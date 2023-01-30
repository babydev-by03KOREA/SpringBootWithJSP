package com.spring.jsp.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
	private Long id;
	private String itemName;
	private Integer price;
	private String itemDetail;
	private String sellStatCd;
	private LocalDateTime regTime;
	private LocalDateTime updateTime;
}
