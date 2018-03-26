package com.xianzhi.dao;

import java.util.List;
import com.xianzhi.bean.GoodUnitBean;

public interface GoodUnitDao {
	
	
	int insertGoodUnit(GoodUnitBean goodUnitBean);

	List<GoodUnitBean> getAllGoodUnit();
	
	int updateGoodUnit(GoodUnitBean goodUnitBean);
	
}
