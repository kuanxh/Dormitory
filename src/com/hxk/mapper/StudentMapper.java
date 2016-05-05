package com.hxk.mapper;
import com.hxk.model.Student;

public interface StudentMapper {
	
	//获取个人信息
	public Student selectStudent(String stuNumber);
	
}
