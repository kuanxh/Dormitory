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
	
}
