package com.spring.jsp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/vue")
public class VueController {
	
	private Logger logger = LoggerFactory.getLogger(VueController.class);
	
	@GetMapping
	public String vueJspIndex() {
		logger.info("vue main page approach");
		return "vue/vueMain";
	}
	
}
