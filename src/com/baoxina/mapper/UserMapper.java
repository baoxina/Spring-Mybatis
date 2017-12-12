package com.baoxina.mapper;

import com.baoxina.po.User;

public interface UserMapper {

	public User findUserById(Integer id) throws Exception;
}
