package com.hxk.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hxk.mapper.UsersMapper;
import com.hxk.model.Users;
import com.hxk.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private UsersMapper usersMapper;
	
	//用户信息
	public Users getUsers(String name,String password) {
		Users users = usersMapper.selectUser(name, password);
		return users;
	}


}
