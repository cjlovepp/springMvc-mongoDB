package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.entity.HomeWork;

@Repository
public interface MongoDbTestDao {
	
	//����
	public void insert(HomeWork homeWork);
	
	//��ѯ
	public List<HomeWork> findAll();
	
	//������ѯ
	public HomeWork findById(String id);
	
	//�޸�
	public void update(String id , String title);
	
	//ɾ��
	public void delet(String id);
	
}
