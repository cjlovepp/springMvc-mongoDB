package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.entity.HomeWork;

@Repository
public interface MongoDbTestDao {
	
	//插入
	public void insert(HomeWork homeWork);
	
	//查询
	public List<HomeWork> findAll();
	
	//条件查询
	public HomeWork findById(String id);
	
	//修改
	public void update(String id , String title);
	
	//删除
	public void delet(String id);
	
}
