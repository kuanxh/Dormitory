package com.hxk.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.hxk.model.AdminDor;
import com.hxk.model.AdminStu;
import com.hxk.model.Visitor;

public interface AdminService {
	public List<AdminStu> getAllStudent();
	public AdminStu getStudent(String id);
	public void importAdminStuXls(InputStream in) throws IOException;
	public List<AdminDor> getAllDor();
	public void importAdminDorXls(InputStream in) throws IOException;
	
	//获取所有游客的信息
	public List<Visitor> getAllVisitor();
	//插入单条游客信息
	public void insertVis(Visitor visitor);
}
