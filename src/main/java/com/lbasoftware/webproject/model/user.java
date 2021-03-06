package com.lbasoftware.webproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int userId;
	@Column
	private String name;
	
	public user() {}
	public user(int id, String name)
	{
		this.userId=id;
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
		
}
