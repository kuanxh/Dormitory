package com.hxk.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hxk.model.Users;
import com.hxk.service.impl.LoginServiceImpl;

@Controller
public class LoginController {
	
	@Autowired
	private LoginServiceImpl loginSerImpl;
	
	
	@RequestMapping("/")
	public String showLogin(){
		return "login";
	}
	
	
	//login鍚庤烦杞笉鍚岀殑椤甸潰 骞朵紶閫掔敤鎴峰弬鏁帮紙鏈夌己闄风洿鎺ュ湪login涓紶閫掔敤鎴凤紝鍦╝dminstu涓潵鑾峰彇鏁版嵁锛�
	
	
	//使用cookie来存储标识
	@RequestMapping("/login")
	public String loginSer(String name,String pass, HttpServletResponse res){
		//System.out.println(name+""+pass);
		
		Users user = loginSerImpl.getUsers(name, pass);
		
		//model.addObject("User", user);
		if(user == null){
			return "/";
		}
//		else{
//			//使用cookie来存储用户的唯一id
//			Cookie cookie = new Cookie("idNum", user.getName());
//			res.addCookie(cookie);
//		}
		else if(user.getType().equals("学生")){
			Cookie cookie = new Cookie("idNum", user.getName());
			res.addCookie(cookie);
			return "redirect:stuProfile";
		}else if(user.getType().equals("系统管理员")){
			Cookie cookie = new Cookie("SidNum", user.getName());
			res.addCookie(cookie);
			return "redirect:supProfile";
		}else if(user.getType().equals("宿舍管理员")){
			
//			AdminStu adminStu = adminSerImpl.getStudent(user.getName());
//			System.out.println(adminStu);
//			model.addObject("as", adminStu);
//			model.setViewName("forward:adminProfile");
//			return model;
			Cookie cookie = new Cookie("DidNum", user.getName());
			res.addCookie(cookie);
			return "redirect:adminProfile";
		}else{
			//System.out.println("4"+user.getType());
			return "/";
		}
	}
}
