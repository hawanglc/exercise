package com.baby.javaStudy.mybatis.v1;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserTestV1B {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			System.out.println("initialize static field of MybatisTestUser");

			reader = Resources.getResourceAsReader("com/baby/javaStudy/mybatis/v1/Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("public static void main(String[] args)");
		SqlSession session = sqlSessionFactory.openSession();
		try {
			User user = (User) session.selectOne("com.baby.javaStudy.mybatis.v1.User.selectUserByID", 1);
			System.out.println(user);
		} finally {
			session.close();
		}
	}
}
