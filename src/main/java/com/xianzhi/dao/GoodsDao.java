package com.xianzhi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xianzhi.bean.GoodsBean;

public interface GoodsDao {

	int insertGoods(GoodsBean goodsBean);

	int updateGoods(GoodsBean goodsBean);

	int deleteGoodsById(int goodId);

	GoodsBean getGoodsById(int goodId);

	List<GoodsBean> getGoodsBypage(@Param("goodsCondition")GoodsBean goodsCondition,@Param("page")int page, @Param("offset")int offset);
	
	
}
