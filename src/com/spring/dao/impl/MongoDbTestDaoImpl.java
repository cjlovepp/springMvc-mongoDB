package com.spring.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.spring.dao.MongoDbTestDao;
import com.spring.entity.HomeWork;

public class MongoDbTestDaoImpl implements MongoDbTestDao {
	
	@Resource
	private MongoTemplate mongoTemplate;

	@Override
	public void insert(HomeWork homeWork) {
		// TODO Auto-generated method stub
		mongoTemplate.insert(homeWork);
	}
	
	@Override
	public List<HomeWork> findAll() {
		// TODO Auto-generated method stub
		
		return mongoTemplate.findAll(HomeWork.class);
	}
	
	@Override
	public HomeWork findById(String id) {
		// TODO Auto-generated method stub
		return mongoTemplate.findOne(new Query(Criteria.where("id").is(id)), HomeWork.class);
	}
	
	@Override
	public void update(String id, String title) {
		// TODO Auto-generated method stub
		mongoTemplate.updateFirst(new Query(Criteria.where("id").is(id)), 
				Update.update("title", title), 
				HomeWork.class);
	}
	
	@Override
	public void delet(String id) {
		// TODO Auto-generated method stub
		mongoTemplate.remove(new Query(Criteria.where("id").is(id)), 
				HomeWork.class);
	}
	
}
