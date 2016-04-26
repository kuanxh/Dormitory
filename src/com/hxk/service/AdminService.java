package com.hxk.service;

import java.util.List;

import com.hxk.model.AdminStu;

public interface AdminService {
	public List<AdminStu> getAllStudent();
	public AdminStu getStudent(String id);
}
