package com.xianzhi.dao;

import java.util.List;

import com.xianzhi.bean.GoodPictureBean;

public interface GoodPicDao {
	
	
	int addGoodPic(GoodPictureBean goodPictureBean);
	
	int updateGoodPic(GoodPictureBean goodPictureBean);
	
	List<GoodPictureBean> getGoodPicByGoodId(int goodId);
	
	int deleteGoodPicById(int id);
	
}
