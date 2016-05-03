package com.hxk.mapper;

import java.util.List;
import com.hxk.model.Visitor;

public interface VisitorMapper {
	//获取所有游客信息
	public List<Visitor> selectAllVisitor();
	
	//插入单条游客信息
	public int insertVisitor(Visitor visitor);
}
