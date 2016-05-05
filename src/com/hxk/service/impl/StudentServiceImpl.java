package com.hxk.service.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hxk.mapper.DorRepairMapper;
import com.hxk.model.DorRepair;
import com.hxk.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private DorRepairMapper dorRepairMapper;

	
	@Override
	public List<DorRepair> getDorRepair(String name) {
		return dorRepairMapper.selectStuDorRepair(name);
	}


	@Override
	public void insertDorRepair(DorRepair dorRepair) {
		dorRepairMapper.insertDorRepair(dorRepair);
	}
	
}
