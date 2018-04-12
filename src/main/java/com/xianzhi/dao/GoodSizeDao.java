package com.xianzhi.dao;

import java.util.List;

import com.xianzhi.bean.GoodSizeBean;

public interface GoodSizeDao {
	
	int addGoodSize(GoodSizeBean goodSizeBean);
	
	int updateGoodSize(GoodSizeBean goodSizeBean);
	
	int deletGoodSize(int id);
	
	List<GoodSizeBean> getGoodSizeByGoodId(int goodId);

}
