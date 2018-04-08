package com.xianzhi.service;

import java.util.List;

import com.xianzhi.bean.ArticleBean;

public interface ArticleService {
	
	/*
	 * 查询全部开发文档
	 * */
	
	
	List<ArticleBean> getAllArticle();
	

	/*
	 * 按ID查询开发文档
	 * */
	
	ArticleBean getArticleById(int id);
	
	
}
