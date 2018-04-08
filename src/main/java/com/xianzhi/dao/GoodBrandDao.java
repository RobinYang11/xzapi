package com.xianzhi.dao;

import java.util.List;

import com.xianzhi.bean.GoodBrandBean;

public interface GoodBrandDao {

	int addGoodBrand(GoodBrandBean goodBrandBean);

	int updateGoodBrand(GoodBrandBean goodBrandBean);
	
	List<GoodBrandBean> getAllGoodBrand();
	
}
