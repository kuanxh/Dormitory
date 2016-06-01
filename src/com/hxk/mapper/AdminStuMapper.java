package com.hxk.mapper;

import java.util.List;
import java.util.Map;

import com.hxk.model.AdminStu;

public interface AdminStuMapper {
	//获取所有学生信息
	public List<AdminStu> selectAllStudent();
	
	//获取所有学生信息
	public List<AdminStu> selectStudentBySidx(Map<String , String> map);
	
	
	//插入单条学生信息
	public int insertStudent(AdminStu adminStu);
	
	//删除学生信息
	public int delStudent(int id);
	
	//修改学生信息
	public int updateStudent(AdminStu adminStu);
	
	//根据姓名搜索学生信息
	public List<AdminStu> selectStuByName(String name);

	//根据宿舍号搜索学生信息
	//public int findStudent(String number);

}
