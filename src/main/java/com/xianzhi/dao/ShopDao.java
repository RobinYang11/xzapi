package com.xianzhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xianzhi.bean.ShopBean;

public interface ShopDao {
	
	int insertShop(ShopBean shopBean);
	
	List<ShopBean> getShopByPage(@Param("page") int page, @Param("offset") int offset);
	
	
	
}
