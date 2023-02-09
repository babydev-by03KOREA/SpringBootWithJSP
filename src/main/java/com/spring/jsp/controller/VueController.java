package com.spring.jsp.controller;

import com.spring.jsp.dto.ProductDTO;
import com.spring.jsp.mapper.ProductDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/vue")
public class VueController {
	
	private Logger logger = LoggerFactory.getLogger(VueController.class);

	private final ProductDAO productDAO;

	@Autowired
	public VueController(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@GetMapping
	public String vueJspIndex() {
		logger.info("vue main page approach");
		return "vue/vueMain";
	}

	@GetMapping("/list")
	public String printItemList(Model model) throws Exception {
		List<ProductDTO> productList = productDAO.listProductItems();
		model.addAttribute("productList", productList);
		return "vue/products/list";
	}

	@GetMapping("/add")
	public String addProductsJSP() {
		logger.info("products 입력창 접근");
		return "product/addProducts";
	}

	@PostMapping("/addValues")
	public String addValues(ProductDTO dto) throws Exception {
		productDAO.insert(dto);
		logger.info("입력 완료 후 items로 redirect");
		return "redirect:itemList";
	}

	@GetMapping("/update/{itemName}")
	public String updateProductJSP(@PathVariable String itemName, Model model) throws Exception {
		logger.info("아이템 업데이트 접근");

//		model.addAttribute("itemName", itemName);
		/**
		 * itemName value를 DB에서 SELECT > 입력 폼에 저장 List<DTO> 사용시 List[0]를 JSP에서 줘야하는 불편함이
		 * 생김
		 */
		Map<String, ProductDTO> itemOneMap = productDAO.selectUpdate(itemName);

		model.addAttribute("selectItem", itemOneMap);
		return "product/updateProducts";
	}

	@PostMapping("/updateProduct")
	public String updateProduct(@ModelAttribute ProductDTO dto) throws Exception {
		productDAO.update(dto.getItemName(), dto.getId(), dto.getPrice(), dto.getItemDetail(), dto.getSellStatCd());
		logger.info("[POST] update Product approach > DB");
		return "redirect:itemList";
	}
	
}
