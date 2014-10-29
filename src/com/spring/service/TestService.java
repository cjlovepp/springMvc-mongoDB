package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.TestDao;

@Service
public class TestService {
	@Autowired TestDao testDao;
	
	public String getTest(){
		return testDao.testRestful();
	}

}
