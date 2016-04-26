package com.hxk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxk.mapper.AdminStuMapper;
import com.hxk.model.AdminStu;
import com.hxk.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminStuMapper adminStuMapper;
	
	//管理员学生信息管理
	public List<AdminStu> getAllStudent() {
		// TODO Auto-generated method stub
		List<AdminStu> stu = adminStuMapper.selectAllStudent();
		return stu;
	}

	@Override
	public AdminStu getStudent(String id) {
		
		return adminStuMapper.selectStudentById(id);
	}
}
