package com.hxk.mapper;

import com.hxk.model.Users;

public interface UsersMapper {  
    public Users selectUser(String name,String password);  
} 
