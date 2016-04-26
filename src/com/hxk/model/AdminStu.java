package com.hxk.model;

//管理员管理的student(和本身学生的累不一样)
public class AdminStu {

	public AdminStu() {
		super();
	}
	
	private int id;
	@Override
	public String toString() {
		return "AdminStu [id=" + id + ", name=" + name + ", dorNum=" + dorNum + ", phoneNum=" + phoneNum
				+ ", isInSchool=" + isInSchool + ", note=" + note + "]";
	}

	private String name;
	private String idNum;
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	private String dorNum;
	private String phoneNum;
	private String isInSchool;
	private String note;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDorNum() {
		return dorNum;
	}
	public void setDorNum(String dorNum) {
		this.dorNum = dorNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getIsInSchool() {
		return isInSchool;
	}
	public void setIsInSchool(String isInSchool) {
		this.isInSchool = isInSchool;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
