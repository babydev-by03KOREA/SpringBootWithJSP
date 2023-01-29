package com.spring.jsp.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.jsp.dto.ProductDTO;

@Controller
@RequestMapping(value = "/jsp")
public class JspController {
	@GetMapping
	public ModelAndView indexJSP(ModelAndView mav, Model model) {
		model.addAttribute("hello", "JSP + SPRING BOOT 폼 미쳤다");
		mav.setViewName("index");
		return mav;
	}

	@GetMapping(value = "/product")
	public String jspProduct(Model model) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setItemDetail("iphone 14 Pro");
		productDTO.setItemName("프로 그 이상.");
		productDTO.setPrice(1550000);
		productDTO.setRegTime(LocalDateTime.now());

		model.addAttribute("productDTO", productDTO);
		return "product/product";
	}

	@GetMapping(value = "/products")
	public String jspProducts(Model model) {
		List<ProductDTO> productList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setItemDetail("아이폰 시리즈 " + i);
			productDTO.setItemName("아이폰 " + i);
			productDTO.setPrice(100000 * i);
			productDTO.setRegTime(LocalDateTime.now());
			productList.add(productDTO);
		}
		model.addAttribute("itemList", productList);
		return "product/products";
	}

	@GetMapping(value = "/jspUrl")
	public String jspUrlParameter(@RequestParam("param1") String param1, @RequestParam("param2") String param2,
			Model model) {
		model.addAttribute("param1", param1);
		model.addAttribute("param2", param2);
		return "link";
	}
}
