package com.hh.controller;

import java.util.List;


import com.hh.entity.Waste_type;
import com.hh.service.Waste_typeService;

public class Waste_typeController {

	public static void main(String[] args) {
		Waste_type type = new Waste_type();
		type.setWasteName("水废物");
		type.setWasteCode("HW10");
		int result = new Waste_typeService().add(type);
		if (result > 0) {
			System.out.println("添加成功---" + result);
			System.out.println("自动生成的主键值是：" + type.getId());
		} else {
			System.out.println("添加失败..");
		}
		
		/* 查询所有 */
		List<Waste_type> list = new Waste_typeService().find();
		for (Waste_type waste_type : list) {
			System.out.println(waste_type);
		}
	}
}
