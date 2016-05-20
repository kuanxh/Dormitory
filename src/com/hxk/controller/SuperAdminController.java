package com.hxk.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hxk.model.SupAdmin;
import com.hxk.model.TitleUrl;
import com.hxk.model.Users;
import com.hxk.service.SupAdminService;

@Controller
public class SuperAdminController {

	@Autowired
	SupAdminService supService;
	
	private TitleUrl titleUrl = new TitleUrl();
	
	private String name = null;
	
	private SupAdmin supAdmin = null;
	
	public SuperAdminController() {
		// TODO Auto-generated constructor stub
	}
	
	//超级管理员信息
	@RequestMapping("/supProfile")
	public String showSupProfile(ModelMap modelMap ,HttpServletRequest req){
		//设置导航信息
		titleUrl.setHome("首页");
		titleUrl.setTwo("用户");
		titleUrl.setThree("用户信息");
		titleUrl.setFour("用户信息页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		
		//获取cookie的值
		String idNum;
		Cookie[] cookies = req.getCookies();
		if(null != cookies){
			for(int i = 0; i < cookies.length; i++){
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("idNum")){
					idNum = cookie.getValue();
					System.out.println(idNum);
					supAdmin = supService.getSupAdmin(idNum);
					//获取name存储到cookie中给其他页面来使用
					name = supAdmin.getName();
					modelMap.addAttribute("supadmin", supAdmin);
					modelMap.addAttribute("name", name);	
				}
			}
		}
		return "supProfile";
	}
	//超级管理员信息
	@RequestMapping("/supSetting")
	public String showSupSetting(ModelMap modelMap){
		return "supSetting";
	}
	//超级管理员信息
	@RequestMapping("/supCalendar")
	public String showSupCalendar(ModelMap modelMap){
		return "supCalendar";
	}
	//信息的批量添加
	@RequestMapping("/supUsersInfo")
	public String showSupUsersInfo(ModelMap modelMap){
		return "supUsersInfo";
	}
	//单个信息的批量添加
	@RequestMapping("/supUserInfo")
	public String showSupUserInfo(ModelMap modelMap){
		return "supUserInfo";
	}
	
	//显示所有的用户信息
	@RequestMapping("/supShowInfo")
	public String showSupInfo(ModelMap modelMap){
		return "supShowInfo";
	}
	
	//显示用户信息头像
	@RequestMapping("/showSupAvatar")
	public void showSupAvatar(HttpServletResponse response) throws IOException{
		byte[] data = supAdmin.getAvatar();
		response.setContentType("image/jpeg");  
		response.setCharacterEncoding("UTF-8");  
	    OutputStream outputSream = response.getOutputStream();  
	    InputStream in = new ByteArrayInputStream(data);  
	    int len = 0;  
	    byte[] buf = new byte[1024];  
	    while ((len = in.read(buf, 0, 1024)) != -1) {  
	        outputSream.write(buf, 0, len);  
	    }  
	    outputSream.close();
	}
	
	//获取所有的用户信息
	@ResponseBody
	@RequestMapping("/info/supGetUserInfo")
	public List<Users> getAllUsersInfo(){
		List<Users> users = supService.getAllUsers();
		return users;
	}
	
	//单个用户信息填写处理
	@RequestMapping("/userInfoSetting")
	public String userInfoSetting(Users user){
		supService.addUser(user);
		return "supShowInfo";
	}
}
