package com.hxk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxk.model.DorRepair;
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
	
	@RequestMapping("/stuProfile")
	public String showView(){
		return "stuProfile";
	}
	
	@RequestMapping("/stuSanitation")
	public String showSanitation(){
		return "stuSanitation";
	}
	@RequestMapping("/stuRepair")
	public String showRepair(){
		return "stuRepair";
	}
	@RequestMapping("/stuRepairInfo")
	public String showRepairInfo(){
		return "stuRepairInfo";
	}
	
	@ResponseBody
	@RequestMapping("/info/stuRepairInfo")
	public List<DorRepair> getRepairInfo(){
		return stuSer.getDorRepair("黄兴宽");
	}
	
	
	
}
