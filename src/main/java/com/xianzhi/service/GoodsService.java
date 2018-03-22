package com.xianzhi.service;

import java.util.List;

import com.xianzhi.bean.GoodTypeBean;
import com.xianzhi.bean.GoodUnitBean;
import com.xianzhi.bean.GoodsBean;

public interface GoodsService {

	/*
	 * ������Ʒ
	 */
	int insertGoods(GoodsBean goodsBean);

	/*
	 * ������Ʒ
	 */

	int updateGoods(GoodsBean goodsBean, int goodId);

	/*
	 * ɾ����Ʒ
	 */
	int deleleGoods(GoodsBean goodsBean, int goodId);

	/*
	 * ��id��Ʒ
	 */

	GoodsBean getGoodsById(int goodsId);

	/*
	 * ��ҳ��ѯ��Ʒ page ҳ�� offset ÿҳ������
	 */

	List<GoodsBean> getGoodSByPage( int page, int offset);

	/*
	 * ������Ʒ����
	 */
	
	int insertGoodType(GoodTypeBean goodTypeBean);
	
	/*
	 * ��ѯ���з���
	 */
	
	List<GoodTypeBean> getAllGoodType();

	/*
	 * ������Ʒ��λ
	 */

	int insertGoodUnit(GoodUnitBean goodUnitBean);
	
	
	/*
	 * ��ѯ������Ʒ��λ
	 */

	List<GoodUnitBean> getAllGoodUnit();
	
	/*
	 * ��ȡ��Ʒ����
	 */
	
	int getTotalGoodSize();
	
	
}
