package com.spring.jsp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.spring.jsp.dto.ProductDTO;

@Repository
@Mapper	// 기존 DAO @Repository 사용안함.
public interface ProductDAO {
	// SQL 코드와 매핑되는 메소드를 interface로 생성하며, @Mapper를 지정한다.
	@Select("select * from ProductDTO")
	public List<ProductDTO> listProductItems() throws Exception;

	@Insert("INSERT INTO ProductDTO VALUES (#{id}, #{itemName}, #{price}, #{itemDetail}, #{sellStatCd}, now(), now())")
	public void insert(ProductDTO product) throws Exception;
	
	@Delete("delete from ProductDTO where id = #{id}")
	public void delete(String id) throws Exception;
	
	@Select("select * from ProductDTO where itemName = #{itemName}")
	public Map<String,Object> selectUpdate(String itemName) throws Exception;
	
	@Update("update productDTO set id = #{id}, price = #{price}, itemDetail = #{itemDetail}, sellStatCd = #{sellStatCd}, updateTime = now() where itemName = #{itemName}")
	public void update(ProductDTO product) throws Exception;
	
}
