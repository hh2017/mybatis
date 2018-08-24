package com.hh.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {

	static InputStream inputStream = null;
	static{
		try {
			inputStream = Resources.getResourceAsStream("config/mybatis-config.xml");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	static SqlSessionFactory factory = null;
	static Object obj = new Object();//对象锁
	
	private static SqlSessionFactory getSqlSessionFactory(){
		if(factory == null){
			synchronized(obj){
				if(factory == null){
					factory = new SqlSessionFactoryBuilder().build(inputStream);
				}
			}
		}
		return factory;
		
	}
	
	
	/**
	 * 此方法返回SqlSession对象，此对象就是用于操作数据。
	 * @return
	 */
	public static SqlSession getSqlSession() {
		return getSqlSessionFactory().openSession();
	}
	
}
