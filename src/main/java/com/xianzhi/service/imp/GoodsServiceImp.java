package com.xianzhi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xianzhi.bean.GoodBrandBean;
import com.xianzhi.bean.GoodLabelBean;
import com.xianzhi.bean.GoodPictureBean;
import com.xianzhi.bean.GoodSizeBean;
import com.xianzhi.bean.GoodTypeBean;
import com.xianzhi.bean.GoodUnitBean;
import com.xianzhi.bean.GoodsBean;
import com.xianzhi.dao.GoodBrandDao;
import com.xianzhi.dao.GoodLabelDao;
import com.xianzhi.dao.GoodPicDao;
import com.xianzhi.dao.GoodSizeDao;
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
	@Autowired
	private GoodBrandDao goodBrandDao;
	@Autowired
	private GoodLabelDao goodLabelDao;
	@Autowired
	private GoodSizeDao goodSizeDao;
	@Autowired
	private GoodPicDao goodPicDao;

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
		return goodsDao.getGoodsById(goodsId);
	}

	public List<GoodsBean> getGoodSByPage(int page, int offset) {
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

	public int updateGoodType(GoodTypeBean goodTypeBean) {
		// TODO Auto-generated method stub
		return goodTypeDao.updateGoodTypeById(goodTypeBean);
	}

	public int deleteGoodType(int id) {
		// TODO Auto-generated method stub
		return goodTypeDao.deleteGoodTypeById(id);
	}

	public int updateGoodUnit(GoodUnitBean goodUnitBean) {
		// TODO Auto-generated method stub
		return goodUnitDao.updateGoodUnit(goodUnitBean);
	}

	public int deleteGoodUnit(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addGoodBrand(GoodBrandBean goodBrandBean) {
		// TODO Auto-generated method stub
		return goodBrandDao.addGoodBrand(goodBrandBean);
	}

	public int updateGoodBrand(GoodBrandBean goodBrandBean) {
		// TODO Auto-generated method stub
		return goodBrandDao.updateGoodBrand(goodBrandBean);
	}

	public List<GoodBrandBean> getAllGoodBrand() {
		// TODO Auto-generated method stub
		return goodBrandDao.getAllGoodBrand();
	}

	public int addGoodLabel(GoodLabelBean goodLabelBean) {
		// TODO Auto-generated method stub
		return goodLabelDao.addGoodLabel(goodLabelBean);
	}

	public int updateGoodLabel(GoodLabelBean goodLabelBean) {
		// TODO Auto-generated method stub
		return goodLabelDao.updateGoodLabel(goodLabelBean);
	}

	public void deleteGoodLabel(int id) {
		// TODO Auto-generated method stub
		goodLabelDao.deleteGoodLabelById(id);

	}

	public List<GoodLabelBean> getAllGoodLabel() {
		// TODO Auto-generated method stub
		return goodLabelDao.getAllGoodLabel();
	}

	public int addGoodSize(GoodSizeBean goodSizeBean) {
		// TODO Auto-generated method stub
		return  goodSizeDao.addGoodSize(goodSizeBean);
	}

	public int updateGoodSize(GoodSizeBean goodSizeBean) {
		// TODO Auto-generated method stub
		return goodSizeDao.updateGoodSize(goodSizeBean);
	}

	public List<GoodSizeBean> getGoodSizeByGoodId(int goodId) {
		// TODO Auto-generated method stub
		return goodSizeDao.getGoodSizeByGoodId(goodId);
	}

	public int deleteGoodSizeById(int id) {
		// TODO Auto-generated method stub
		return goodSizeDao.deletGoodSize(id);
	}

	public int addGoodPic(GoodPictureBean goodPictureBean) {
		// TODO Auto-generated method stub
		return goodPicDao.addGoodPic(goodPictureBean);
	}

	public int updateGoodPic(GoodPictureBean goodPictureBean) {
		// TODO Auto-generated method stub
		return goodPicDao.updateGoodPic(goodPictureBean);
	}

	public List<GoodPictureBean> getGoodPicByGoodId(int goodId) {
		// TODO Auto-generated method stub
		return goodPicDao.getGoodPicByGoodId(goodId);
	}

	public int deleteGoodPicById(int id) {
		// TODO Auto-generated method stub
		return goodPicDao.deleteGoodPicById(id);
	}
}
