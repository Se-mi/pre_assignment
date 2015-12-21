package com.mycompany.web07.dao;

import java.util.List;

import com.mycompany.web07.dto.Article;

public interface ArticleDao {
	List <Article> selectAllArticle();
	//Article uploadArticle();
}
