package com.hxk.model;

//管理员管理的student(和本身学生的类不一样)
public class AdminStu {

	public AdminStu() {
		super();
	}
	
	private int id;
	private String year; //入学年份
	private String name; //姓名
	private String address;//家庭住址
	private String number;//宿舍号
	private String phone;//手机号
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String adderss) {
		this.address = adderss;
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
		return "AdminStu [id=" + id + ", year=" + year + ", name=" + name + ", adderss=" + address + ", number="
				+ number + ", phone=" + phone + "]";
	}
}
