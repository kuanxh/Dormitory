package com.hxk.mapper;

import java.util.List;

import com.hxk.model.AdminDor;
import com.hxk.model.AdminStu;

public interface AdminStuMapper {
	//获取所有学生信息
	public List<AdminStu> selectAllStudent();
	public AdminStu selectStudentById(String id);
	
	//插入单条学生信息
	public int insertStudent(AdminStu adminStu);
	
	
	//插入单条宿舍信息
	public int insertDor(AdminDor adminDor);
	
	//获取所有宿舍信息
	public List<AdminDor> selectAllDor();
}
