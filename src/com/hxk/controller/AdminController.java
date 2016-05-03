package com.hxk.controller;

import java.io.InputStream;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hxk.model.AdminDor;
import com.hxk.model.AdminStu;
import com.hxk.model.Visitor;
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
		return "adminStuInfoGL";
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
		return "adminStuInfoLR";
	}	
	
	//宿舍信息录入
	@RequestMapping("/adminDorInfoTJ")
	public String showDorInfoTJ(){
		return "adminDorInfoTJ";
	}
	
	//宿舍信息管理
	@RequestMapping("/adminDorInfoGL")
	public String showDorInfoGL(){
		return "adminDorInfoGL";
	}
	
	//游客信息管理
	@RequestMapping("/adminVisitorInfoGL")
	public String showVisitorInfoGL(){
		return "adminVisitorInfoGL";
	}
	
	//游客信息登记
	@RequestMapping("/adminVisitorInfoDJ")
	public String showVisitorInfoDJ(){
		return "adminVisitorInfoDJ";
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
	
	
	//管理员下的学生信息
	@ResponseBody
	@RequestMapping("/info/adminStu")
	public  List<AdminStu> showStuInfo(){
		List<AdminStu> stu = adminService.getAllStudent();
		return stu;
	}
	
	
	//宿舍信息
	@ResponseBody
	@RequestMapping("/info/adminDor")
	public  List<AdminDor> showDorInfo(){
		List<AdminDor> dor = adminService.getAllDor();
		return dor;
	}
	
	//获取所有游客的信息
	@ResponseBody
	@RequestMapping("/info/adminVisitor")
	public List<Visitor> showVisitorInfo(){
		List<Visitor> vis = adminService.getAllVisitor();
		return vis;
	}
	
	//游客信息处理
	@RequestMapping(value= "/visitorInfoDJ", method = RequestMethod.POST)
	public String VisitorInfoDJ(Visitor visitor){
		//System.out.println(visitor);
		adminService.insertVis(visitor);
		return "adminVisitorInfoGL";
	}
	
	//学生文件上传
	@RequestMapping(value = "/importAdminStu", method = RequestMethod.POST)
	public String importAdminStuInfo(@RequestParam("filename") MultipartFile file,HttpServletRequest request,HttpServletResponse response) throws Exception {
		/*String temp = request.getSession().getServletContext()
				.getRealPath(File.separator)
				+ "temp"; // 临时目录
		File tempFile = new File(temp);
		if (!tempFile.exists()) {
			tempFile.mkdirs();
		}
		DiskFileUpload fu = new DiskFileUpload();
		fu.setSizeMax(10 * 1024 * 1024); // 设置允许用户上传文件大小,单位:位
		fu.setSizeThreshold(4096); // 设置最多只允许在内存中存储的数据,单位:位
		fu.setRepositoryPath(temp); // 设置一旦文件大小超过getSizeThreshold()的值时数据存放在硬盘的目录
		// 开始读取上传信息
		// int index = 0;
		List fileItems = null;
		try {
			fileItems = fu.parseRequest(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Iterator iter = fileItems.iterator(); // 依次处理每个上传的文件
		FileItem fileItem = null;
		while (iter.hasNext()) {
			FileItem item = (FileItem) iter.next();// 忽略其他不是文件域的所有表单信息
			if (!item.isFormField()) {
				fileItem = item;
				// index++;
			}
		}
		
		if (fileItem == null)
			return null;
			*/
		if (file == null){
			System.out.println("file");
			return null;
		}
		//System.out.println("file");
		
		//logger.info(file.getOriginalFilename());

		String name = file.getOriginalFilename();// 获取上传文件名,包括路径
		//System.out.println(name);
		//name = name.substring(name.lastIndexOf("\\") + 1);// 从全路径中提取文件名
		long size = file.getSize();
		if ((name == null || name.equals("")) && size == 0)
			return null;
		InputStream in = file.getInputStream();
		adminService.importAdminStuXls(in);

		// 改为人工刷新缓存KeyContextManager.clearPeriodCacheData(new
		// PeriodDimensions());// 清理所有缓存
		//int count = BrandMobileInfos.size();
		//String strAlertMsg ="";
		
		//strAlertMsg= "成功更新" + count + "条！";
		
		//logger.info(strAlertMsg);
		//request.setAttribute("brandPeriodSortList", BrandMobileInfos);
		//request.setAttribute("strAlertMsg", strAlertMsg);
	
		//request.getSession().setAttribute("msg",strAlertMsg);
		return "adminStuInfoGL";
		//return null;
	}
	
	//宿舍文件上传、
	@RequestMapping(value = "/importAdminDor", method = RequestMethod.POST)
	public String importAdminDorInfo(@RequestParam("filename") MultipartFile file,HttpServletRequest request,HttpServletResponse response) throws Exception {
		if (file == null){
			System.out.println("file");
			return "";
		}
		String name = file.getOriginalFilename();// 获取上传文件名,包括路径
		long size = file.getSize();
		if ((name == null || name.equals("")) && size == 0)
			return "";
		InputStream in = file.getInputStream();
		adminService.importAdminDorXls(in);
		return "adminDorInfoGL";
	}
}
