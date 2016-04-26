package com.hxk.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxk.model.AdminStu;
import com.hxk.service.AdminService;

@Controller
//@RequestMapping("/admin")
public class AdminController {
	
	@Autowired(required=true)
	private AdminService adminService;
	
	//根据URL地址来进行页面跳转
	/*
	@RequestMapping("/{url}")
	public String showError(ModelMap madelMap,@PathVariable("url")String url){
		madelMap.addAttribute("url", url);
		return "baseAdmin";
	}
	*/
	/*
	//@ResponseBody
	@RequestMapping("/info/adminStu")
	public String showStuInfo(ModelMap modelMap){
		List<AdminStu> stu = adminService.getAllStudent();
		modelMap.addAttribute("stu", stu);
		return "testView";
	}*/
	
	
	//学生信息管理
	@RequestMapping("/adminStuInfoGL")
	public String showStuInGL(){
		return "stuInfoGL";
	}
	
	//信息设置
	@RequestMapping("/adminSetting")
	public String showInfoSetting(){
		return "adminSetting";
	}
	
	//个人信息
	@RequestMapping("/adminProfile")
	public String showProfile(HttpServletRequest req){
		//System.out.println(user);
		String idNum;
		Cookie[] cookies = req.getCookies();
		if(null != cookies){
			for(int i = 0; i < cookies.length; i++){
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("idNum")){
					idNum = cookie.getValue();
					System.out.println(idNum);
				}
			}
		}
		return "adminProfile";
	}
	//日历
	@RequestMapping("/adminCalendar")
	public String showCalendar(){
		return "adminCalendar";
	}
	
	//学生信息录入
	@RequestMapping("/adminStuInfoLR")
	public String showStuInfoLR(){
		return "stuInfoLR";
	}	
	
	//404
	@RequestMapping("/error404")
	public String show404(){
		return "error-404";
	}	
	//500
	@RequestMapping("/error500")
	public String show500(){
		return "error-500";
	}
	
	
	
	@ResponseBody
	@RequestMapping("/info/adminStu")
	public  List<AdminStu> showStuInfo(){
		List<AdminStu> stu = adminService.getAllStudent();
		return stu;
	}
	
	
	@RequestMapping("/info/visitorInfoGL")
	public String showVisitorInfo(ModelMap modelMap){
		//List<AdminStu> stu = adminService.getAllStudent();
		//modelMap.addAttribute("stu", stu);
		return "visitorInfoGL";
	}
}
