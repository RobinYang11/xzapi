package com.xianzhi.dao;

import com.xianzhi.bean.AreaBean;

public interface AreaDao {

	int insertArea(AreaBean areaBean);

	int updateArea(AreaBean areaBean);
	
	AreaBean getAreaById(int id);

}
