package com.hxk.service;

import java.util.List;

import com.hxk.model.SupAdmin;
import com.hxk.model.Users;

public interface SupAdminService {
	//获取所有的用户信息
	public List<Users> getAllUsers();
	
	//获取所有的用户信息
	public int addUser(Users user);
	
	//获取所有的用户信息
	public SupAdmin getSupAdmin(String idNum);
	
}
