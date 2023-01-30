package com.spring.jsp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MapperRepository {
	public Integer toData(String findStr);
}
