package com.xianzhi.service;

import java.util.List;

import com.xianzhi.bean.ShopBean;

public interface ShopService {
	
	/*
	 * author:���ƽ 
	 * ���ӵ���
	 * */
	
	int insertSHop(ShopBean shopBean);
	/*
	 * author:���ƽ 
	 * ��ҳ��ѯ
	 * */
	List<ShopBean> getSHopByPage(int page ,int offset);
	
	/*
	 * author:���ƽ 
	 * ��ȡ��ҳ��
	 * */
	int getTotalShopSize();
	
}
