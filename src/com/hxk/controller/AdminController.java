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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.hxk.model.Admin;
import com.hxk.model.AdminDor;
import com.hxk.model.AdminForm;
import com.hxk.model.AdminStu;
import com.hxk.model.DorRepair;
import com.hxk.model.Sanitation;
import com.hxk.model.TitleUrl;
import com.hxk.model.Visitor;
import com.hxk.service.AdminService;

@Controller
//@RequestMapping("/admin")
public class AdminController {
	
	@Autowired(required=true)
	private AdminService adminService;
	
	private TitleUrl titleUrl = new TitleUrl();
	
	
	private String name = null;
	
	private Admin admin = null;
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
	public String showStuInGL(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("学生管理");
		titleUrl.setThree("学生信息管理");
		titleUrl.setFour("学生信息页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "adminStuInfoGL";
	}
	
	//信息设置
	@RequestMapping("/adminSetting")
	public String showInfoSetting(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("用户");
		titleUrl.setThree("用户信息设置");
		titleUrl.setFour("用户信息设置页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "adminSetting";
	}
	
	//个人信息
	@RequestMapping("/adminProfile")
	public String showProfile(ModelMap modelMap ,HttpServletRequest req){
		
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
					admin = adminService.getAdmin(idNum);
					//获取name存储到cookie中给其他页面来使用
					name = admin.getName();
					
					modelMap.addAttribute("admin", admin);
					modelMap.addAttribute("name", name);
					
				}
			}
		}
		
		//
		
		return "adminProfile";
	}
	
	//显示管理员头像
	@RequestMapping("/showAvatar")
	public void getAvatar(HttpServletResponse response) throws IOException{
		byte[] data = admin.getAvatar();
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
	
	
	
	//日历
	@RequestMapping("/adminCalendar")
	public String showCalendar(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("日历");
		titleUrl.setThree("日历信息");
		titleUrl.setFour("日历信息页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "adminCalendar";
	}
	
	//学生信息录入
	@RequestMapping("/adminStuInfoLR")
	public String showStuInfoLR(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("学生管理");
		titleUrl.setThree("学生信息录入");
		titleUrl.setFour("学生信息录入页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "adminStuInfoLR";
	}	
	
	//宿舍信息录入
	@RequestMapping("/adminDorInfoTJ")
	public String showDorInfoTJ(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("宿舍管理");
		titleUrl.setThree("宿舍信息录入");
		titleUrl.setFour("宿舍信息录入页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "adminDorInfoTJ";
	}
	
	//宿舍信息管理
	@RequestMapping("/adminDorInfoGL")
	public String showDorInfoGL(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("宿舍管理");
		titleUrl.setThree("宿舍信息管理");
		titleUrl.setFour("宿舍信息管理页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "adminDorInfoGL";
	}
	
	
	//卫生信息录入
	@RequestMapping("/adminSanitationLR")
	public String showSanitationInfoLR(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("卫生管理");
		titleUrl.setThree("卫生信息录入");
		titleUrl.setFour("卫生信息录入页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "adminSanitationLR";
	}
	
	//卫生信息管理
	@RequestMapping("/adminSanitationGL")
	public String showSanitationInfoGL(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("卫生管理");
		titleUrl.setThree("卫生信息管理");
		titleUrl.setFour("卫生信息管理页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "adminSanitationGL";
	}
		
	
	//游客信息管理
	@RequestMapping("/adminVisitorInfoGL")
	public String showVisitorInfoGL(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("来访管理");
		titleUrl.setThree("来访信息管理");
		titleUrl.setFour("来访信息管理页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "adminVisitorInfoGL";
	}
	
	//游客信息登记
	@RequestMapping("/adminVisitorInfoDJ")
	public String showVisitorInfoDJ(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("来访管理");
		titleUrl.setThree("来访信息登记");
		titleUrl.setFour("来访信息登记页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "adminVisitorInfoDJ";
	}
	
	//报修信息管理
	@RequestMapping("/adminRepairInfo")
	public String showRepairInfo(ModelMap modelMap){
		titleUrl.setHome("首页");
		titleUrl.setTwo("报修管理");
		titleUrl.setThree("报修信息管理");
		titleUrl.setFour("报修信息管理页面");
		modelMap.addAttribute("titleUrl", titleUrl);
		modelMap.addAttribute("name", name);
		return "adminRepairInfo";
	}
	
	
	//报修信息
	@ResponseBody
	@RequestMapping("/info/adminDorRepair")
	public List<DorRepair> getRepairInfo(){
		List<DorRepair> dorRs = adminService.getAllDorRepair();
		return dorRs;
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
	
	
	//卫生信息
	@ResponseBody
	@RequestMapping("/info/adminSan")
	public  List<Sanitation> showSanInfo(){
		List<Sanitation> san = adminService.getAllSan();
		return san;
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
	
	//卫生文件上传、
	@RequestMapping(value = "/importAdminSan", method = RequestMethod.POST)
	public String importAdminSanInfo(@RequestParam("filename") MultipartFile file,HttpServletRequest request,HttpServletResponse response) throws Exception {
		if (file == null){
			System.out.println("file");
			return "";
		}
		String name = file.getOriginalFilename();// 获取上传文件名,包括路径
		long size = file.getSize();
		if ((name == null || name.equals("")) && size == 0)
			return "";
		InputStream in = file.getInputStream();
		adminService.insertSan(in);
		return "adminSanitationGL";
	}
	
	
	
	//个人信息设置
	@RequestMapping(value="/infoSetting")
	public String infoSetting(ModelMap modelMap,AdminForm adminForm) throws IOException{
		//System.out.println(adminForm);
		
		MultipartFile avatar = adminForm.getAvatar();
		InputStream is = avatar.getInputStream();  
	    byte[] avatarData1 = new byte[(int) avatar.getSize()];  
	    is.read(avatarData1);  

	    System.out.println(avatarData1.getClass());
	    adminService.saveAvatar(avatarData1);
	    
		return "adminProfile";
	}
}
