package com.spring.jsp.mybatis;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jsp.dto.MyBatisDTO;
import com.spring.jsp.dto.ProductDTO;
import com.spring.jsp.mapper.MyBatisTest;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MyBatisUnitTest {
//	DataSource > DB와 관련된 커넥션 정보를 담고있으며, 빈으로 등록하여 인자를 넘겨준다.
//	Connection Info > application.properties File
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DataSource dataSource;
	@Autowired
	private MyBatisTest myBatisTest;

	@Test
	public void MapperTest() throws Exception {
		/*
		 * where age = #{VALUE} 기반으로 사용자의 모든 정보를 긁어온다. 
		 * 이때 가져오는 타입은 MyBatisDTO를 기반으로 한다.
		 * exclude(불포함) 시켰기 때문에 출력된 결과에 id값은 존재하지 않는다.
		 */
		MyBatisDTO user = myBatisTest.getAge(21);
		logger.info("가져온 값 " + user);
		assertEquals("박형주", user.getName());
	}
	

	@Test
	public void conTest() throws SQLException {
		logger.info("DS = " + dataSource);
		try (Connection con = dataSource.getConnection()) {
			assertThat(con).isInstanceOf(Connection.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getProductTest() throws Exception {
		ProductDTO products = myBatisTest.getProductID("mockID");
		logger.info("가져온 상품들 > " + products);
		assertEquals("mockID", products.getId());
	}

}
