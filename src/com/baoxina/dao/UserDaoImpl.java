package com.baoxina.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.baoxina.po.User;

/**
 * spring��mybatis����֮��ʵ��ԭʼdao�Ĺؼ����� UserDaoImpl�̳���SqlSessionDaoSupport
 * 
 * ����SqlSessionDaoSupport��ά����sqlSession�����sqlSessionFactory����
 * ����� UserDaoImpl����Ҫ�ٴ�����sqlSessionFactory��ֻ��Ҫ��spring�����ļ���UserDaoImpl����bean��ע��sqlSessionFactory����
 * �����UserDaoImpl��ʹ�ø���SqlSessionDaoSupportsqlSession�ļ���getSqlSession()������ȡ��sqlSession����
 * ���������ֶ��ر�sqlSession����UserDaoImpl�ķ���ִ����֮����Զ��ر�sqlSession
 * @author baoxina
 *
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	@Override
	public User findUserById(int id) throws Exception {
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		return user;
	}
}
