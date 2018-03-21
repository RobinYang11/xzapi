package com.xianzhi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xianzhi.bean.ShopBean;
import com.xianzhi.dao.ShopDao;
import com.xianzhi.service.ShopService;

@Service
public class ShopServiceImp implements ShopService {

	@Autowired
	private ShopDao shopDao;
	
	public int insertSHop(ShopBean shopBean) {
		// TODO Auto-generated method stub
		return shopDao.insertShop(shopBean);
	}

	public List<ShopBean> getSHopByPage(int page, int offset) {
		// TODO Auto-generated method stub
		return shopDao.getShopByPage(page, offset);
	}

	public int getTotalShopSize() {
		// TODO Auto-generated method stub
		return shopDao.getTotalShopSize();
	}

}
