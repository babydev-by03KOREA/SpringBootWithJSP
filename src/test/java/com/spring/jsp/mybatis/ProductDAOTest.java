package com.spring.jsp.mybatis;

import com.spring.jsp.dto.ProductDTO;
import com.spring.jsp.mapper.ProductDAO;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

import static java.time.LocalDateTime.now;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ProductDAOTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ProductDAO dao;

    @DisplayName("select one item")
    @Test
    public void getSelectOneTest() throws Exception {
        Map<String, ProductDTO> products = dao.selectUpdate("junit");
        logger.info("select item one > " + products);
    }

    @DisplayName("update one item")
    @Test
    public void getProductUpdateTest() throws Exception {
        ProductDTO dto = new ProductDTO();
        dto.setId("blblbl");
        dto.setPrice(1000);
        dto.setSellStatCd("SELL");
        dto.setItemDetail("blablablabla");
//        dao.update();
        // 생각해보니깐 아이템을 DTO 형식으로 받는건 맞는데 그럼 업데이트 할때 itemName은 어케찾음?
    }

}
