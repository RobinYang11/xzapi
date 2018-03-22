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
	
	
	/*
	 * 按 Id删除商品分类
	 */
	int deleteGoodTypeById(int id);
	
	
	/*
	 * 按 ID更新商品分类
	 */
	int updateGoodTypeById(GoodTypeBean goodTypeBean);


}
