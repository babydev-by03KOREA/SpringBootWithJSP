package com.spring.jsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = {"com.spring.jsp.mapper"})
public class SpringBootJspApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJspApplication.class, args);
	}

//	extends SpringBootServletInitializer
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(SpringBootJspApplication.class);
//	}

}
