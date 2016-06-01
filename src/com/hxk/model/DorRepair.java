package com.hxk.model;

public class DorRepair {

	public DorRepair() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String number;
	private String name;
	private String phone;
	private String type;
	private String date;
	private String comment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "DorRepair [number=" + number + ", name=" + name + ", phone=" + phone + ", type=" + type + ", date="
				+ date + ", comment=" + comment + "]";
	}
	
}
