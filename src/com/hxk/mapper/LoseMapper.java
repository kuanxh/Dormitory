package com.hxk.mapper;

import java.util.List;

import com.hxk.model.AdminDor;
import com.hxk.model.AdminStu;
import com.hxk.model.DorRepair;
import com.hxk.model.Lose;

public interface LoseMapper {
	//插入单条遗失信息
	public int insertLose(Lose lose);
	
	//获取所有物品遗失信息
	public List<Lose> selectAllLose();
	
	//获取我的的遗失信息
	public List<Lose> selectMyLose(String name);
	
}
