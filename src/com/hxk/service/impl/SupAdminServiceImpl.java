package com.hxk.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxk.mapper.SupAdminMapper;
import com.hxk.mapper.UsersMapper;
import com.hxk.model.SupAdmin;
import com.hxk.model.Users;
import com.hxk.service.SupAdminService;


@Service
public class SupAdminServiceImpl implements SupAdminService{

	@Autowired
	private UsersMapper usersMapper;
	
	@Autowired
	private SupAdminMapper supAdminMapper;

	@Override
	public List<Users> getAllUsers() {
		List<Users> users = usersMapper.selectAllUser();
		return users;
	}

	@Override
	public int addUser(Users user) {
		int i = usersMapper.insertUser(user);
		return i;
	}

	@Override
	public SupAdmin getSupAdmin(String idNum) {
		SupAdmin supAdmin = supAdminMapper.selectSupAdmin(idNum);
		return supAdmin;
	}
	

}
