package com.xianzhi.dao;

import java.util.List;

import com.xianzhi.bean.GoodLabelBean;

public interface GoodLabelDao {

	int addGoodLabel(GoodLabelBean goodLabelBean);
	
	int updateGoodLabel(GoodLabelBean goodLabelBean);
	
	void deleteGoodLabelById(int id);
	
	List<GoodLabelBean> getAllGoodLabel();
	

}
