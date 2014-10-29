package com.spring.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="HomeWork")
public class HomeWork {
	
	private String id;
	private String title;
	private String description;
	private Date finishedTime;
	private String published;
	private String reviewed;
	private String receiveType;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getFinishedTime() {
		return finishedTime;
	}
	public void setFinishedTime(Date finishedTime) {
		this.finishedTime = finishedTime;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	public String getReviewed() {
		return reviewed;
	}
	public void setReviewed(String reviewed) {
		this.reviewed = reviewed;
	}
	public String getReceiveType() {
		return receiveType;
	}
	public void setReceiveType(String receiveType) {
		this.receiveType = receiveType;
	}
	
	

}
