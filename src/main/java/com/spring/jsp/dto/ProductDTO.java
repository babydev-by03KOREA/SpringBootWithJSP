package com.spring.jsp.dto;

import java.time.LocalDateTime;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor 
@NoArgsConstructor
@Data
/** 
 * Builder Pattern
 * @NoArgsConstructor > 파라미터가 없는 기본 생성자를 생성
 * @AllArgsConstructor > 모든 필드값을 받는 생성자를 생성
 * @RequiredArgsConstructor > @NonNull, final인 필드 값만 파라미터로 받는 생성자를 생성(필수값) */
public class ProductDTO {
	private String id;
	private String itemName;
	private Integer price;
	private String itemDetail;
	private String sellStatCd;
	@Nullable
	private LocalDateTime regTime;
	@Nullable
	private LocalDateTime updateTime;
}
