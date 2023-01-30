package com.spring.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.jsp.service.MyBatisService;

@Controller
@RequestMapping(value = "/mybatis")
public class MyBatisController {
	@Autowired
	MyBatisService service;
	
	@GetMapping
	public ModelAndView mybatisConfigTest() {
		ModelAndView mav = new ModelAndView();
		int numberDBValue = service.toSize("");
		
		mav.addObject("numberDB", numberDBValue);
		mav.setViewName("mybatis/config");
		return mav;
	}
	
}
