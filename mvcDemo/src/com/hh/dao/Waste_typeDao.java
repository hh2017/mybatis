package com.hh.dao;

import java.util.List;

import com.hh.entity.Waste_type;

public interface Waste_typeDao {

	public List<Waste_type> find();
	public Waste_type findById(int id);
	//添加，返回int类型，表示数据库中受影响的行数
	public int add(Waste_type waste_type);
	//修改，返回数据库受影响的行数。
	public int update(Waste_type waste_type);
	//根据主键ID删除某一条数据
	public int delete(int id);
	
}
