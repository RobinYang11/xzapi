package com.xianzhi.dao;

import java.util.List;

import com.xianzhi.bean.GoodTypeBean;

public interface GoodTypeDao {

	/*
	 * ���ӷ���
	 */
	int insertGoodType(GoodTypeBean goodTypeBean);
	
	
	
	/*
	 * ��ѯ���в�Ʒ����
	 */
	List<GoodTypeBean> getAllGoodType();


}
