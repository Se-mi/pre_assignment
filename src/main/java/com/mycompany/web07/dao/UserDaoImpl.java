package com.mycompany.web07.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mycompany.web07.dto.User;

public class UserDaoImpl implements UserDao {
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}
	public SqlSession getSqlSession() {
		return sqlSession;
	}
	@Override
	public List<User> selectAllUser() {
		@SuppressWarnings("unchecked")
		// TODO Auto-generated method stub
		List<User> users = sqlSession.selectList("selectAllUser");
		
		return users;
	}
}
