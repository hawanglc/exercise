package com.baby.javaStudy.mybatis.v2;


import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserTestV2 {

	public static void main(String[] args) {
		SqlSession session = null;

		try {
			Reader reader = Resources.getResourceAsReader("com/baby/javaStudy/mybatis/v2/Configuration.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();
			
			IUserOperation userOperation = session.getMapper(IUserOperation.class);
			
			System.out.println("========selectByID() test========");
			User user = userOperation.selectByID(2);
			System.out.println(user);
			
			System.out.println("========selectByName() test========");
			List<User> users = userOperation.selectByName("%wang%");
			for(User user2 : users){
				System.out.println(user2);
			}
			
			System.out.println("========add() test========");
			User user3 = new User();
			user3.setClassification(1);
			user3.setName("baby");
			user3.setAddress("beijing");
			user3.setRemark("added from userTestv2.java");
			System.out.println("new user info is: "+user3);
			userOperation.add(user3);
			session.commit();
			
			System.out.println("========updateRemark() test========");
			User user4 = userOperation.selectByID(2);
			System.out.println("old user info is "+user4);
			user4.setRemark("modified from userTestV2.java");
			userOperation.updateRemark(user4);
			session.commit();
			user4 = userOperation.selectByID(2);
			System.out.println("new user info is "+user4);
			
			System.out.println("========delete() test========");
			User user5 = userOperation.selectByID(2);
			System.out.println("user need delete info is "+user5);
			userOperation.delete(user5.getId());
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
