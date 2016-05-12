package com.hxk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/superadmin")
public class SuperAdminController {

	public SuperAdminController() {
		// TODO Auto-generated constructor stub
	}
	
	//超级管理员信息
	@RequestMapping("/supProfile")
	public String showSupProfile(){
		return "supProfile";
	}
	//信息的批量添加
	@RequestMapping("/supUsersInfo")
	public String showSupUsersInfo(){
		return "supUsersInfo";
	}
	//单个信息的批量添加
	@RequestMapping("/supUserInfo")
	public String showSupUserInfo(){
		return "supUserInfo";
	}
}
