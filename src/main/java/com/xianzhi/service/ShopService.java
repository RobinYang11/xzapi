package com.xianzhi.service;

import java.util.List;

import com.xianzhi.bean.ShopBean;

public interface ShopService {
	
	
	
	int insertSHop(ShopBean shopBean);
	
	List<ShopBean> getSHopByPage(int page ,int offset);
	
	
}
