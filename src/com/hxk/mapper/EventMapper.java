package com.hxk.mapper;

import java.util.List;

import com.hxk.model.Event;

public interface EventMapper {
	
	//获取管理员信息
	public List<Event> selectEvent();
	
	//插入活动
	public int insertEvent(Event event);
	
}
