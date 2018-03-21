package com.xianzhi.service;

import java.util.List;

import com.xianzhi.bean.ShopBean;

public interface ShopService {
	
	/*
	 * author:杨国平 
	 * 增加店铺
	 * */
	
	int insertSHop(ShopBean shopBean);
	/*
	 * author:杨国平 
	 * 分页查询
	 * */
	List<ShopBean> getSHopByPage(int page ,int offset);
	
	/*
	 * author:杨国平 
	 * 获取总页数
	 * */
	int getTotalShopSize();
	
}
