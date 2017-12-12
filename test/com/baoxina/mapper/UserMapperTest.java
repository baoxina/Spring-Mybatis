package com.baoxina.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoxina.po.User;

public class UserMapperTest {

	ApplicationContext context;
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		UserMapper userMapper = (UserMapper) context.getBean("userMapper");
		User user = userMapper.findUserById(1);
		System.out.println(user);
	}

}
