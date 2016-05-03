package com.hxk.model;

public class AdminDor {
	public AdminDor() {
		super();
	}
	private String id;
	private String count; //人数
	private String name; //姓名
	private String admin;//家庭住址
	private String number;//宿舍号
	private String phone;//手机号
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "AdminDor [id=" + id + ", count=" + count + ", name=" + name + ", admin=" + admin + ", number=" + number
				+ ", phone=" + phone + "]";
	}
	
	
}
