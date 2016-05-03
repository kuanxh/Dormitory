package com.hxk.model;

public class Visitor {

	public Visitor() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String date;
	private String sex;
	private String comment;
	private String email;
	private String phone;
	private String qq;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	@Override
	public String toString() {
		return "Visitor [name=" + name + ", date=" + date + ", sex=" + sex + ", comment=" + comment + ", email=" + email
				+ ", phone=" + phone + ", qq=" + qq + "]";
	}
	
	
}
