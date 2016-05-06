package com.hxk.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxk.model.DorRepair;
import com.hxk.model.Lose;
import com.hxk.model.Student;
import com.hxk.model.TitleUrl;
import com.hxk.service.StudentService;

@Controller
//@RequestMapping("/student")
public class StudentController {
	
//	@RequestMapping("/stuProfile")
//	public String showView(ModelMap madelMap,@PathVariable("url")String url){
//		//madelMap.addAttribute("url", url);
//		return "baseStudent";
//	}
	
	
	@Autowired
	StudentService stuSer;
	
	private TitleUrl titleUrl = new TitleUrl();
	
	private String name = null;
	
	//学生信息
	@RequestMapping("/stuProfile")
	public String showStuProfile(ModelMap modelMap,HttpServletRequest req){
		titleUrl.setHome("首页");
		titleUrl.setTwo("用户");
		titleUrl.setThree("用户信息设置");
		titleUrl.setFour("用户信息设置页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		
		Cookie[] cookies = req.getCookies();
		if(null != cookies){
			for(int i = 0; i < cookies.length; i++){
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("idNum")){
					String idNum = cookie.getValue();
					Student stu = stuSer.getStudent(idNum);
					
					name = stu.getName();
					modelMap.addAttribute("name", name);
					
					modelMap.addAttribute("student", stu);
					
				}
			}
		}
		return "stuProfile";
	}
	
	//修改个人信息
	@RequestMapping("/stuSetting")
	public String setStuProfile(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("用户");
		titleUrl.setThree("用户信息设置");
		titleUrl.setFour("用户信息设置页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "stuSetting";
	}
	
	//日历
	@RequestMapping("/stuCalendar")
	public String showStuCalendar(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("日历");
		titleUrl.setThree("日历");
		titleUrl.setFour("日历页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "stuCalendar";
	}
	
	//卫生信息
	@RequestMapping("/stuSanitation")
	public String showSanitation(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("卫生");
		titleUrl.setThree("卫生信息");
		titleUrl.setFour("卫生信息页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "stuSanitation";
	}
	
	//报修信息填写
	@RequestMapping("/stuRepair")
	public String showRepair(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("报修");
		titleUrl.setThree("在线报修");
		titleUrl.setFour("在线报修页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "stuRepair";
	}
	
	//我的报修信息
	@RequestMapping("/stuRepairInfo")
	public String showRepairInfo(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("报修");
		titleUrl.setThree("我的报修信息");
		titleUrl.setFour("我的报修信息页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "stuRepairInfo";
	}
	
	//获取报修信息
	@ResponseBody
	@RequestMapping("/info/stuRepairInfo")
	public List<DorRepair> getRepairInfo(){
		return stuSer.getDorRepair("黄兴宽");
	}
	
	//报修信息处理
	@RequestMapping("/repairInfo")
	public String RepairInfo(DorRepair dorRepair){
		stuSer.insertDorRepair(dorRepair);
		return "stuRepairInfo";
	}
	
	
	//所有的遗失信息
	@RequestMapping("/stuAllLose")
	public String stuAllLose(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("遗失");
		titleUrl.setThree("所有遗失信息");
		titleUrl.setFour("所有遗失信息页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "stuAllLose";
	}
	
	
	//我的遗失信息
	
	@RequestMapping("/stuMyLose")
	public String stuMyLose(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("遗失");
		titleUrl.setThree("我的遗失信息");
		titleUrl.setFour("我的遗失信息页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "stuMyLose";
	}
	//遗失信息登记
	@RequestMapping("/stuLose")
	public String stuLose(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("遗失");
		titleUrl.setThree("遗失信息登记");
		titleUrl.setFour("遗失信息登记页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "stuLose";
	}
	
	//遗失信息处理
	@RequestMapping("/LoseInfo")
	public String LoseInfo(Lose lose){
		stuSer.insertLose(lose);
		return "stuMyLose";
	}
	
	
	//获取所有的遗失信息
	@ResponseBody
	@RequestMapping("/info/allLoseinfo")
	public List<Lose> AllLoseInfo(){
		List<Lose> loses = stuSer.getAllLose();
		return loses;
	}
	
	//获取我的遗失信息
	@ResponseBody
	@RequestMapping("/info/myLose")
	public List<Lose> MyLoseInfo(){
		return stuSer.getMyLose("黄兴宽");
	}
	
}
