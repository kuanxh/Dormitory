package com.hxk.model;

public class Users {

	public Users() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Users [name=" + name + ", password=" + password + ", type=" + type + "]";
	}
	private int id;
	private String name;
	private String password;
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	

}
