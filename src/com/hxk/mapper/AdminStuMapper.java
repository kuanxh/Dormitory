package com.hxk.mapper;

import java.util.List;

import com.hxk.model.AdminDor;
import com.hxk.model.AdminStu;

public interface AdminStuMapper {
	//获取所有学生信息
	public List<AdminStu> selectAllStudent();
	
	//插入单条学生信息
	public int insertStudent(AdminStu adminStu);
	
	//删除学生信息
	public int delStudent(String id);
	
	//修改学生信息
	public int updateStudent(AdminStu adminStu);
	
	//根据姓名搜索学生信息
	public int findStuByName(String name);

	//根据宿舍号搜索学生信息
	//public int findStudent(String number);

}
