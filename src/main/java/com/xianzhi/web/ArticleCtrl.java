package com.xianzhi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xianzhi.bean.ArticleBean;
import com.xianzhi.service.ArticleService;

@RestController
@RequestMapping(value = "/article")
public class ArticleCtrl {

	@Autowired
	private ArticleService articleService;

	@ResponseBody
	@RequestMapping(value = "/getAllArticle", method = RequestMethod.GET)
	public List<ArticleBean> getAllArticle() {
		return articleService.getAllArticle();
	}

	@ResponseBody
	@RequestMapping(value = "/getArticleById", method = RequestMethod.GET)
	public ArticleBean getArticleById(int id) {
		return articleService.getArticleById(id);
	}
	
}
