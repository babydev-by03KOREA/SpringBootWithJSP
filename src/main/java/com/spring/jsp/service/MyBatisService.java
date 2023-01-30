package com.spring.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.spring.jsp.mapper.MapperRepository;

@Service
@Transactional
public class MyBatisService {
	@Autowired
	MapperRepository mapper;
	
	@Autowired
	PlatformTransactionManager manager;
	
	public int toSize(String str) {
		TransactionStatus status = 
				manager.getTransaction(new DefaultTransactionDefinition());
		int toSize =0;
		try {
			toSize = mapper.toData("");
			
			//manager.commit(status);
			//manager.rollback(status);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return toSize;
	}
}
