package com.hxk.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.hxk.model.Admin;
import com.hxk.model.AdminDor;
import com.hxk.model.AdminStu;
import com.hxk.model.DorRepair;
import com.hxk.model.Event;
import com.hxk.model.Sanitation;
import com.hxk.model.Visitor;

public interface AdminService {
	//首次进入获取所有学生的信息
	public List<AdminStu> getAllStudent();
	//根据要求字段排序
	public List<AdminStu> getStudentBySidx(Map<String , String> map);
	
	public void importAdminStuXls(InputStream in) throws IOException;
	public List<AdminDor> getAllDor();
	public void importAdminDorXls(InputStream in) throws IOException;
	
	//获取所有游客的信息
	public List<Visitor> getAllVisitor();
	//插入单条游客信息
	public void insertVis(Visitor visitor);
	
	//获取所有卫生的信息
	public List<Sanitation> getAllSan();
	//插入单条卫生信息
	public void insertSan(InputStream in)throws IOException;
	
	
	//获取所有报修的信息
	public List<DorRepair> getAllDorRepair();
	
	//获取所有报修的信息
	public Admin getAdmin(String admNumber);
	
	//插入头像
	public void saveAvatar(Map<String, Object> param);
	
	
	//
	//学生信息管理jqgrid的
	//
	
	//插入单条学生信息
	public int insertOneStudent(AdminStu adminStu);
	
	//删除学生信息
	public int deleteStudent(int id);
	
	//修改学生信息
	public int updateStudent(AdminStu adminStu);
	
	//根据姓名搜索学生信息
	public List<AdminStu> findStuByName(String name);
	
	//获取管理员的活动信息
	public List<Event> findAllEvent();	
	
	//插入活动
	public int addEvent(Event event);
}
