package com.hxk.service;

import com.hxk.model.Users;

public interface LoginService {
	public Users getUsers(String name,String password);
}
