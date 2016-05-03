package com.hxk.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.hxk.model.AdminDor;
import com.hxk.model.AdminStu;

public interface AdminService {
	public List<AdminStu> getAllStudent();
	public AdminStu getStudent(String id);
	public void importAdminStuXls(InputStream in) throws IOException;
	public List<AdminDor> getAllDor();
	public void importAdminDorXls(InputStream in) throws IOException;
}
