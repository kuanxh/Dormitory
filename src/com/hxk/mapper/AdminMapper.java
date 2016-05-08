package com.hxk.mapper;
import java.util.Map;

import com.hxk.model.Admin;

public interface AdminMapper {
	
	//获取管理员信息
	public Admin selectAdmin(String idNum);
	
	//更新头像
	public void updateAdminAvatar(Map<String, Object> param);
	
}
