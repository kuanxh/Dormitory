package com.hxk.mapper;

import java.util.List;

import com.hxk.model.AdminDor;
import com.hxk.model.AdminStu;

public interface AdminDorMapper {
	//插入单条宿舍信息
	public int insertDor(AdminDor adminDor);
	
	//获取所有宿舍信息
	public List<AdminDor> selectAllDor();
	
}
