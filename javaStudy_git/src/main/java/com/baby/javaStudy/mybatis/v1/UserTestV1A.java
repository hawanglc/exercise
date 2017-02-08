package com.baby.javaStudy.mybatis.v1;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserTestV1A {
	public static void main(String[] args) {

		SqlSession session = null;

		try {
			Reader reader = Resources.getResourceAsReader("com/baby/javaStudy/mybatis/v1/Configuration.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

			// 调用查询语句，并绑定SQL的参数，对数据进行查询。
			User user = (User) session.selectOne("com.baby.javaStudy.mybatis.v1.User.selectUserByID", 1);

			// 如果User类中没有覆盖toString()，则下面的信息将显示User类的类名等信息
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
