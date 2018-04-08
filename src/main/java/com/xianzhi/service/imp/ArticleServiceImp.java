package com.xianzhi.service.imp;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xianzhi.bean.ArticleBean;
import com.xianzhi.dao.ArticleDao;
import com.xianzhi.service.ArticleService;

@Service
public class ArticleServiceImp implements ArticleService {
	
	@Autowired
	private ArticleDao articleDao;
	
	public List<ArticleBean> getAllArticle() {
		// TODO Auto-generated method stub
		return articleDao.getAllArticle();
	}

	public ArticleBean getArticleById(int id) {
		// TODO Auto-generated method stub
		return articleDao.getArticleById(id);
	}

}
