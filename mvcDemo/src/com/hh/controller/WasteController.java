package com.hh.controller;

import java.util.List;

import com.hh.entity.Waste_type;
import com.hh.service.Waste_typeService;

public class WasteController {
	public static void main(String[] args) {
	
		
		/* 查询所有 */
		List<Waste_type> list = new Waste_typeService().find();
		for (Waste_type waste_type : list) {
			System.out.println(waste_type);
		}
	}
}
