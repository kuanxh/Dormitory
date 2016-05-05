package com.hxk.service;

import java.util.List;

import com.hxk.model.DorRepair;
import com.hxk.model.Lose;
import com.hxk.model.Student;

public interface StudentService {
	//宿舍报修管理
	public List<DorRepair> getDorRepair(String name);
	public void insertDorRepair(DorRepair dorRepair);
	
	//物品遗失管理
	public List<Lose> getMyLose(String name);
	public List<Lose> getAllLose();
	public void insertLose(Lose lose);
	
	//获取个人信息
	public Student getStudent();
}
