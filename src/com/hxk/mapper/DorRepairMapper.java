package com.hxk.mapper;

import java.util.List;

import com.hxk.model.AdminDor;
import com.hxk.model.AdminStu;
import com.hxk.model.DorRepair;

public interface DorRepairMapper {
	//插入单条报修信息
	public int insertDorRepair(DorRepair dorRepair);
	
	//获取所有报修信息（管理员那显示）
	public List<DorRepair> selectAllDorRepair();
	
	//获取学生的报修信息
	public List<DorRepair> selectStuDorRepair(String name);
	
}
