package com.spring.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/vue")
public class VueController {
	@GetMapping
	public String vueJspIndex() {
		return "vue/vueMain";
	}
	
}
