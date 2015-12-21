package com.mycompany.web07.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mycompany.web07.dto.Article;

public class ArticleDaoImpl implements ArticleDao {

	private SqlSession sqlSession;
	
	@Override
	public List<Article> selectAllArticle() {
		@SuppressWarnings("unchecked")
		// TODO Auto-generated method stub
		List<Article> articles = sqlSession.selectList("selectAllArticle");
		
		return articles;
	}

	
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}
	public SqlSession getSqlSession() {
		return sqlSession;
	}



	
}
