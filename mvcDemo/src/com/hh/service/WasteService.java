package com.hh.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;

import com.hh.dao.WasteDao;
import com.hh.entity.Waste;
import com.hh.util.SqlSessionFactoryUtil;

public class WasteService {
	public List<Waste> find(){
		List<Waste> list = null;
		SqlSession sqlSession = null;
		
		try{
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			WasteDao dao = sqlSession.getMapper(WasteDao.class);
			
			list= dao.find();
			list= dao.find();
		
			List<Waste> list1 = dao.findByTypeId(2);
			List<Waste> list2 = dao.findByTypeId(3);
			
		}catch (Exception ex) {
			Logger.getLogger(WasteService.class.getName()).log(Level.SEVERE, null, ex);
		}finally{
			sqlSession.close();
		}
		return list;
	}
}
