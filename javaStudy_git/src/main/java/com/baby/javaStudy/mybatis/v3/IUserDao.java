package com.baby.javaStudy.mybatis.v3;

public interface IUserDao {
	// 根据用户ID查询用户信息
	public User select(int id);

	// 增加用户信息
	public void add(User user);

	// 删除用户信息
	public void delete(int id);

	// 修改用户信息
	public void update(User user);
	public void update2(User user);
}
