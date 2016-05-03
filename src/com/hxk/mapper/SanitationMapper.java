package com.hxk.mapper;

import java.util.List;

import com.hxk.model.AdminDor;
import com.hxk.model.AdminStu;
import com.hxk.model.Sanitation;

public interface SanitationMapper {
	//插入单条卫生信息
	public int insertSanitation(Sanitation sanitation);
	
	//获取所有卫生信息
	public List<Sanitation> selectAllSanitation();
	
}
