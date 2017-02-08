package com.baby.javaStudy.mybatis.v2;

import java.util.List;

public interface IUserOperation {

	public User selectByID(int id);
	public List<User> selectByName(String name);
	public void add(User book);
	public void updateRemark(User book);
	public void delete(int id);
}
