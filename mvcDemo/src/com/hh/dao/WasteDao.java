package com.hh.dao;

import java.util.List;

import com.hh.entity.Waste;

public interface WasteDao {

	public List<Waste> find();
	
	public List<Waste> findByTypeId(int id);
}
