package com.baoxina.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.baoxina.po.User;

/**
 * spring与mybatis整合之后实现原始dao的关键在于 UserDaoImpl继承了SqlSessionDaoSupport
 * 
 * 由于SqlSessionDaoSupport中维护了sqlSession对象和sqlSessionFactory对象，
 * 因此在 UserDaoImpl不需要再次申明sqlSessionFactory，只需要在spring配置文件里UserDaoImpl所在bean中注入sqlSessionFactory即可
 * 最后在UserDaoImpl中使用父类SqlSessionDaoSupportsqlSession的即可getSqlSession()方法获取到sqlSession对象，
 * 并且无需手动关闭sqlSession，在UserDaoImpl的方法执行完之后会自动关闭sqlSession
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
