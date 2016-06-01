package com.hxk.model;

import java.util.Arrays;

public class SupAdmin {

	public SupAdmin() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private String phone;
	private String supnumber;
	private byte[] avatar;
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSupnumber() {
		return supnumber;
	}
	public void setSupnumber(String supnumber) {
		this.supnumber = supnumber;
	}
	
	public byte[] getAvatar() {
		return avatar;
	}
	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}
	@Override
	public String toString() {
		return "SupAdmin [name=" + name + ", phone=" + phone + ", supnumber=" + supnumber + ", avatar="
				+ Arrays.toString(avatar) + "]";
	}
	
	
	
}
