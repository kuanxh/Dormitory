package com.hxk.mapper;
import java.util.List;

import com.hxk.model.Users;
public interface UsersMapper {  
	//登录时需要查询表
    public Users selectUser(String name,String password);  
    
    //系统管理员查看所有的用户信息
    public List<Users> selectAllUser();
    
    //插入单个用户信息
    public int insertUser(Users user);
} 
