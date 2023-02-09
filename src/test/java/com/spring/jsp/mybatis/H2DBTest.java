package com.spring.jsp.mybatis;

import java.time.LocalDateTime;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jsp.dto.ProductDTO;
import com.spring.jsp.mapper.ProductDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class H2DBTest {

	private Logger logger = LoggerFactory.getLogger(H2DBTest.class);

	private final ProductDAO productDAO;

	@Autowired
	public H2DBTest(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Test
	public void insertTest() throws Exception {
		ProductDTO products = new ProductDTO();
		products.setId("junit");
		products.setItemName("junit");
		products.setPrice(100);
		products.setItemDetail("junit test case");
		products.setSellStatCd("SOLD-OUT");
		products.setRegTime(LocalDateTime.now());
		products.setUpdateTime(LocalDateTime.now());
		logger.info("test Products > " + products.toString());
		productDAO.insert(products);
	}

	@Test
	public void deleteTest() throws Exception {
		logger.info("junit 삭제");
		productDAO.delete("junit");
	}

	@Test
	public void updateTest() throws Exception {
		logger.info("junit update");

		productDAO.update("junit", "junit Update", 1000, "junit test case update", "SELL");
	}

}
