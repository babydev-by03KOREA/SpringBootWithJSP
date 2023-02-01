package com.spring.jsp.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

import com.spring.jsp.dto.MemberFormDTO;

@Mapper
@Repository
public interface MemberMapper {
	@Insert("insert into member(name, age) values (#{name}, #{age}")
	@Options(useGeneratedKeys = true, keyProperty = "email")
	void insertData(MemberFormDTO member);
}
