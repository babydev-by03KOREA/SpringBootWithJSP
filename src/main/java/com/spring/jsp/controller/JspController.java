package com.spring.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/jsp")
public class JspController {
	@GetMapping
	public ModelAndView indexJSP(ModelAndView mav, Model model) {
		model.addAttribute("hello", "JSP + SPRING BOOT 폼 미쳤다");
		mav.setViewName("index");
		return mav;
	}
}
