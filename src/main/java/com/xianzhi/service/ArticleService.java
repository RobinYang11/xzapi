package com.xianzhi.service;

import java.util.List;

import com.xianzhi.bean.ArticleBean;

public interface ArticleService {
	
	/*
	 * ��ѯȫ�������ĵ�
	 * */
	
	
	List<ArticleBean> getAllArticle();
	

	/*
	 * ��ID��ѯ�����ĵ�
	 * */
	
	ArticleBean getArticleById(int id);
	
	
}
