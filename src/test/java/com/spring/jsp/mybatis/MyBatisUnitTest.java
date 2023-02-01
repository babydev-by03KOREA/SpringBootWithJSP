package com.spring.jsp.mybatis;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.jsp.dto.MyBatisDTO;
import com.spring.jsp.mapper.MyBatisTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisUnitTest {
//	DataSource > DB와 관련된 커넥션 정보를 담고있으며, 빈으로 등록하여 인자를 넘겨준다.
//	Connection Info > application.properties File
	private final DataSource dataSource;
	private final MyBatisTest myBatisTest;

//	 생성자의 주입 / spring에서 가장 권장하는 방법
	@Autowired
	public MyBatisUnitTest(DataSource dataSource, MyBatisTest myBatisTest) {
		this.dataSource = dataSource;
		this.myBatisTest = myBatisTest;
	}

	@Test
	public void MapperTest() throws Exception {
		/*
		 * where age = #{VALUE} 기반으로 사용자의 모든 정보를 긁어온다. 
		 * 이때 가져오는 타입은 MyBatisDTO를 기반으로 한다.
		 * exclude(불포함) 시켰기 때문에 출력된 결과에 id값은 존재하지 않는다.
		 */
		MyBatisDTO user = myBatisTest.getAge(21);
		System.out.println("가져온 값 " + user);
		assertEquals("박형주", user.getName());
	}

	@Test
	public void conTest() throws SQLException {
		System.out.println("DS = " + dataSource);
		try (Connection con = dataSource.getConnection()) {
			assertThat(con).isInstanceOf(Connection.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
