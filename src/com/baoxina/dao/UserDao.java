package com.baoxina.dao;

import com.baoxina.po.User;

public interface UserDao {
	public User findUserById(int id) throws Exception;
}
