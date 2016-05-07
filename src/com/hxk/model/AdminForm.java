package com.hxk.model;

import org.springframework.web.multipart.MultipartFile;

public class AdminForm {

	public AdminForm() {
		
	}
	private MultipartFile avatar;
	private String phone;
	private String password;
	
	public MultipartFile getAvatar() {
		return avatar;
	}
	public void setAvatar(MultipartFile avatar) {
		this.avatar = avatar;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "AdminForm [avatar=" + avatar + ", phone=" + phone + ", password=" + password + "]";
	}
	
}
