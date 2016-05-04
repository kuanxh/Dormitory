package com.hxk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/student")
public class StudentController {
	
//	@RequestMapping("/stuProfile")
//	public String showView(ModelMap madelMap,@PathVariable("url")String url){
//		//madelMap.addAttribute("url", url);
//		return "baseStudent";
//	}
	
	@RequestMapping("/stuProfile")
	public String showView(){
		return "stuProfile";
	}
	
	
}
