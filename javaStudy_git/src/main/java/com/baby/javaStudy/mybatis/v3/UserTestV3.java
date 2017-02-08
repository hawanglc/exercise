package com.baby.javaStudy.mybatis.v3;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserTestV3 {
	public static void main(String[] args) {
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession session = null;
		String resource = "com/baby/javaStudy/mybatis/v3/Configuration.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			IUserDao userDao = new UserDaoImpl(sqlSessionFactory);
			// 查询
			User user = userDao.select(1);
			System.out.println("查询得到的信息是：" + user);

			// 修改
			user = userDao.select(1);
			user.setRemark("modified by wanglc using mybatis.v3");
			System.out.println("修改后的信息为：" + user);
			userDao.update(user);

			// 添加
			user = new User();
			user.setClassification(1);
			user.setName("baby");
			user.setAddress("zhengzhou");
			user.setRemark("added by mybatis.v3");
			System.out.println("新添加的信息是：" + user);
			userDao.add(user);

			// 删除
			userDao.delete(3);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
