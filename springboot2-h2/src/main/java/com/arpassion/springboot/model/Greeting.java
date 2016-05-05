package com.arpassion.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	public Greeting() {
		
	}
	
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", content=" + content + "]";
	}
	
	
	
	
}
