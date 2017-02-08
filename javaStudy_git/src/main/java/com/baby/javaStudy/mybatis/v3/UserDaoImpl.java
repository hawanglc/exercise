package com.baby.javaStudy.mybatis.v3;


import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserDaoImpl implements IUserDao {

	// 需要向dao实现类中注入sqlSessionFactory
	private SqlSessionFactory sqlSessionFactory;

	// 在这里用构造方法注入
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public User select(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		User user = session.selectOne("com.baby.javaStudy.mybatis.v3.UserMapperDao.select", id);
		session.close();
		return user;
	}

	public void add(User user) {
		SqlSession session = sqlSessionFactory.openSession();
		session.insert("com.baby.javaStudy.mybatis.v3.UserMapperDao.add", user);
		session.commit();
		session.close();

	}

	public void delete(int id) {
		SqlSession session = sqlSessionFactory.openSession();
		session.delete("com.baby.javaStudy.mybatis.v3.UserMapperDao.delete", id);
		session.commit();
		session.close();

	}

	public void update(User user) {
		SqlSession session = sqlSessionFactory.openSession();
		session.update("com.baby.javaStudy.mybatis.v3.UserMapperDao.update", user);
		session.commit();
		session.close();
	}
	
	public void update2(User user) {
		SqlSession session = sqlSessionFactory.openSession();
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("tablename","user");
		params.put("remark","'modified by dynamic sql'" );
		params.put("id", user.getId());
		
		
		//getSqlMapClientTemplate().update("com.baby.study.javaStudy.mybatis.UserMapperDao.update2",params);
		session.update("com.baby.javaStudy.mybatis.v3.UserMapperDao.update2", params);
		session.commit();
		session.close();
	}

}