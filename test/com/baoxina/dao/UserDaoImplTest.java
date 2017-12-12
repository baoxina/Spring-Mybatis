package com.baoxina.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baoxina.po.User;

public class UserDaoImplTest {

	ApplicationContext context;
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		UserDao dao = (UserDao) context.getBean("userDao");
		User user = dao.findUserById(1);
		System.out.println(user);
	}

}
