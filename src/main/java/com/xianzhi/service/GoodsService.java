package com.xianzhi.service;

import java.util.List;

import com.xianzhi.bean.GoodTypeBean;
import com.xianzhi.bean.GoodUnitBean;
import com.xianzhi.bean.GoodsBean;

public interface GoodsService {

	/*
	 * 增加商品
	 */
	int insertGoods(GoodsBean goodsBean);

	/*
	 * 更新商品
	 */

	int updateGoods(GoodsBean goodsBean, int goodId);

	/*
	 * 删除商品
	 */
	int deleleGoods(GoodsBean goodsBean, int goodId);

	/*
	 * 按id商品
	 */

	GoodsBean getGoodsById(int goodsId);

	/*
	 * 分页查询商品 page 页数 offset 每页的数量
	 */

	List<GoodsBean> getGoodSByPage(GoodsBean goodsBean, int page, int offset);

	/*
	 * 增加商品分类
	 */

	int insertGoodType(GoodTypeBean goodTypeBean);

	/*
	 * 增加商品单位
	 */

	int insertGoodUnit(GoodUnitBean goodUnitBean);
	
	
}
