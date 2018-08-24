package com.hh.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;

import com.hh.dao.Waste_typeDao;
import com.hh.entity.Waste_type;
import com.hh.util.SqlSessionFactoryUtil;

public class Waste_typeService {

	public List<Waste_type> find(){
		List<Waste_type> list = null;
		SqlSession sqlSession = null;
		
		try{
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			
			list= dao.find();
			
		}catch (Exception ex) {
			Logger.getLogger(Waste_typeService.class.getName()).log(Level.SEVERE, null, ex);
		}finally{
			sqlSession.close();
		}
		return list;
	}
	
	
	
	public Waste_type findById(int id) {
		Waste_type waste_type = null;
		SqlSession sqlSession=null;		
		try {
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			//取代理对象
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			waste_type = dao.findById(id);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally {
			sqlSession.close();
		}
		return waste_type;		
	}
	public int add(Waste_type waste_type) {
		SqlSession sqlSession=null;
		int result =0 ;
		try {
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			//取代理对象
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			result =  dao.add(waste_type);  //调用方法，获取到受影响的行数
			sqlSession.commit();  //注意增，删，改的处理，必须要提交事务，否则不会真正意义上对数据库产生影响
		}catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally {
			sqlSession.close();  //关闭连接,并没有真正意义上的资源释放，只是把连接返回到连接池中，等待下一次使用。
		}
		return result;
	}
	public int update(Waste_type waste_type) {
		SqlSession sqlSession=null;
		int result =0 ;
		try {
			sqlSession = SqlSessionFactoryUtil.getSqlSession();
			//取代理对象
			Waste_typeDao dao = sqlSession.getMapper(Waste_typeDao.class);
			result =  dao.update(waste_type);  //调用方法，获取到受影响的行数
			sqlSession.commit();  //注意增，删，改的处理，必须要提交事务，否则不会真正意义上对数据库产生影响
		}catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		finally {
			sqlSession.close();  //关闭连接,并没有真正意义上的资源释放，只是把连接返回到连接池中，等待下一次使用。
		}
		return result;
	}
}
