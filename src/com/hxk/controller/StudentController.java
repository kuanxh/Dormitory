package com.hxk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxk.model.DorRepair;
import com.hxk.model.Lose;
import com.hxk.model.Student;
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
	
	
	//学生信息
	@RequestMapping("/stuProfile")
	public String showStuProfile(ModelMap modelMap){
		Student stu = stuSer.getStudent();
		modelMap.addAttribute("student", stu);
		return "stuProfile";
	}
	
	//修改个人信息
	@RequestMapping("/stuSetting")
	public String setStuProfile(){
		return "stuSetting";
	}
	
	//日历
	@RequestMapping("/stuCalendar")
	public String showStuCalendar(){
		return "stuCalendar";
	}
	
	//卫生信息
	@RequestMapping("/stuSanitation")
	public String showSanitation(){
		return "stuSanitation";
	}
	
	//报修信息填写
	@RequestMapping("/stuRepair")
	public String showRepair(){
		return "stuRepair";
	}
	
	//我的报修信息
	@RequestMapping("/stuRepairInfo")
	public String showRepairInfo(){
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
		System.out.println(dorRepair);
		stuSer.insertDorRepair(dorRepair);
		return "stuRepairInfo";
	}
	
	
	//所有的遗失信息
	@RequestMapping("/stuAllLose")
	public String stuAllLose(){

		return "stuAllLose";
	}
	
	
	//我的遗失信息
	
	@RequestMapping("/stuMyLose")
	public String stuMyLose(){

		return "stuMyLose";
	}
	//遗失信息登记
	@RequestMapping("/stuLose")
	public String stuLose(){
		return "stuLose";
	}
	
	//遗失信息处理
	@RequestMapping("/LoseInfo")
	public String LoseInfo(Lose lose){
		System.out.println(lose);
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
