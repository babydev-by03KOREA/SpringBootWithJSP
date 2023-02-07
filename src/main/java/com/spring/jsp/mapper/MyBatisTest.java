package com.spring.jsp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.jsp.dto.MyBatisDTO;
import com.spring.jsp.dto.ProductDTO;

@Mapper
@Qualifier("MyBatisUnitTest")
public interface MyBatisTest {
	/* 
	 *  Eclipse 블록주석> mac: cmd + ctrl + shift + /
	 *  ${} 가 아닌 #{} 사용!
	 */
	@Select("select * from jspBoot where age = #{age}")
	MyBatisDTO getAge(@Param("age") int age) throws Exception;
	
	@Select("select * from productDTO where id = #{id}")
	ProductDTO getProductID(@Param("id") String id) throws Exception;
}
