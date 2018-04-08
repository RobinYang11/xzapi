package com.xianzhi.dao;

import java.util.List;

import com.xianzhi.bean.ArticleBean;

public interface ArticleDao {
	
	
	List<ArticleBean> getAllArticle();
	
	ArticleBean getArticleById( int id);

}
