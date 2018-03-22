package com.xianzhi.dao;

import java.util.List;

import com.xianzhi.bean.GoodTypeBean;

public interface GoodTypeDao {

	/*
	 * 增加分类
	 */
	int insertGoodType(GoodTypeBean goodTypeBean);
	
	
	
	/*
	 * 查询所有产品分类
	 */
	List<GoodTypeBean> getAllGoodType();


}
