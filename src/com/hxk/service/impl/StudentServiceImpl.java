package com.hxk.service.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hxk.mapper.DorRepairMapper;
import com.hxk.mapper.LoseMapper;
import com.hxk.mapper.StudentMapper;
import com.hxk.model.DorRepair;
import com.hxk.model.Lose;
import com.hxk.model.Student;
import com.hxk.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private DorRepairMapper dorRepairMapper;

	@Autowired
	private LoseMapper loseMapper;
	
	@Autowired
	private StudentMapper studentMapper;
	
	//宿舍报修管理
	@Override
	public List<DorRepair> getDorRepair(String name) {
		return dorRepairMapper.selectStuDorRepair(name);
	}


	@Override
	public void insertDorRepair(DorRepair dorRepair) {
		dorRepairMapper.insertDorRepair(dorRepair);
	}

	//物品遗失信息
	@Override
	public List<Lose> getMyLose(String name) {
		return loseMapper.selectMyLose(name);
	}

	@Override
	public List<Lose> getAllLose() {
		return loseMapper.selectAllLose();
	}

	@Override
	public void insertLose(Lose lose) {
		loseMapper.insertLose(lose);
	}

	//获取个人信息
	@Override
	public Student getStudent() {
		return studentMapper.selectStudent();
	}
		
}
