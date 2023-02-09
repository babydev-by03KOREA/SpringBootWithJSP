package com.spring.jsp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.spring.jsp.dto.ProductDTO;

@Repository
@Mapper	// 기존 DAO @Repository 사용안함.
public interface ProductDAO {
	// SQL 코드와 매핑되는 메소드를 interface로 생성하며, @Mapper를 지정한다.
	@Select("select * from ProductDTO")
	List<ProductDTO> listProductItems() throws Exception;

	@Insert("INSERT INTO ProductDTO VALUES (#{id}, #{itemName}, #{price}, #{itemDetail}, #{sellStatCd}, now(), now())")
	void insert(ProductDTO product) throws Exception;
	
	@Delete("delete from ProductDTO where itemName = #{itemName}")
	void delete(String itemName) throws Exception;
	
	@Select("select * from ProductDTO where itemName = #{itemName}")
	Map<String,ProductDTO> selectUpdate(String itemName) throws Exception;
	
	@Update("update productDTO set id = #{id}, price = #{price}, itemDetail = #{itemDetail}, sellStatCd = #{sellStatCd}, updateTime = now() where itemName = #{itemName}")
	void update(@Param("itemName") String itemName, @Param("id") String id, @Param("price") int price,@Param("itemDetail") String itemDetail, @Param("sellStatCd") String sellStatCd) throws Exception;
	// 할거면 다 파라미터로 받아라 > pathValue 쓰고, PostMethod니깐 짜피 안보인다..?
}
