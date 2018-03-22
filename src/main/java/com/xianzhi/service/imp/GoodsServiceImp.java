package com.xianzhi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xianzhi.bean.GoodTypeBean;
import com.xianzhi.bean.GoodUnitBean;
import com.xianzhi.bean.GoodsBean;
import com.xianzhi.dao.GoodTypeDao;
import com.xianzhi.dao.GoodUnitDao;
import com.xianzhi.dao.GoodsDao;
import com.xianzhi.service.GoodsService;

@Service
public class GoodsServiceImp implements GoodsService {
	
	@Autowired
	private GoodsDao goodsDao;
	@Autowired
	private GoodTypeDao goodTypeDao;
	@Autowired 
	private GoodUnitDao goodUnitDao;
	

	public int insertGoods(GoodsBean goodsBean) {
		// TODO Auto-generated method stub
		return goodsDao.insertGoods(goodsBean);
	}

	public int updateGoods(GoodsBean goodsBean, int goodId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleleGoods(GoodsBean goodsBean, int goodId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public GoodsBean getGoodsById(int goodsId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<GoodsBean> getGoodSByPage( int page, int offset) {
		// TODO Auto-generated method stub
		return goodsDao.getGoodsBypage(page, offset);
	}

	public int insertGoodType(GoodTypeBean goodTypeBean) {
		// TODO Auto-generated method stub
		return goodTypeDao.insertGoodType(goodTypeBean);
	}

	public int insertGoodUnit(GoodUnitBean goodUnitBean) {
		// TODO Auto-generated method stub
		return goodUnitDao.insertGoodUnit(goodUnitBean);
	}

	public int getTotalGoodSize() {
		// TODO Auto-generated method stub
		return goodsDao.getTotalGoodSize();
	}

	public List<GoodTypeBean> getAllGoodType() {
		// TODO Auto-generated method stub
		return goodTypeDao.getAllGoodType();
	}

	public List<GoodUnitBean> getAllGoodUnit() {
		// TODO Auto-generated method stub
		return goodUnitDao.getAllGoodUnit();
	}

	

}
