package com.hxk.controller;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hxk.model.AdminStu;
import com.hxk.model.Users;
import com.hxk.service.impl.AdminServiceImpl;
import com.hxk.service.impl.LoginServiceImpl;

@Controller
public class LoginController {
	
	@Autowired
	private LoginServiceImpl loginSerImpl;
	
	@Autowired
	private AdminServiceImpl adminSerImpl;
	
	@RequestMapping("/")
	public String showLogin(){
		return "login";
	}
	
	
	//login后跳转不同的页面 并传递用户参数（有缺陷直接在login中传递用户，在adminstu中来获取数据）
	
	
	//使用cookie来存储用户的用户名 
	@RequestMapping("/login")
	public String loginSer(String name,String pass, HttpServletResponse res){
		//System.out.println(name+""+pass);
		
		Users user = loginSerImpl.getUsers(name, pass);
		
		//model.addObject("User", user);
		if(user == null){
			return "";
		}
		else{
			Cookie cookie = new Cookie("idNum", user.getName());
			res.addCookie(cookie);
		}
		
		if(user.getType().equals("stu")){
			System.out.println("1");
			return "redirect:stuProfile";
		}else if(user.getType().equals("sup")){
			System.out.println("2");
			return "redirect:supProfile";
		}else if(user.getType().equals("adm")){
			System.out.println("dsad");
			
			//根据卡号来查询学生
//			AdminStu adminStu = adminSerImpl.getStudent(user.getName());
//			System.out.println(adminStu);
//			model.addObject("as", adminStu);
//			model.setViewName("forward:adminProfile");
//			return model;
			
			//有缺陷（多用户！）
			
			return "redirect:adminProfile";
		}else{
			System.out.println("4"+user.getType());
			return "";
		}
	}
}
