package com.hxk.mapper;

import java.util.List;
import com.hxk.model.AdminStu;

public interface AdminStuMapper {
	public List<AdminStu> selectAllStudent();
	public AdminStu selectStudentById(String id);
}
