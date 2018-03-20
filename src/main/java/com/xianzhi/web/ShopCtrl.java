package com.xianzhi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xianzhi.bean.ShopBean;
import com.xianzhi.service.ShopService;

@RestController
@RequestMapping("/shop")
public class ShopCtrl {

	@Autowired
	private ShopService shopService;

	@RequestMapping(value = "/addShop", method = RequestMethod.POST)
	public void registerShop(ShopBean shopBean) {

		shopService.insertSHop(shopBean);

	}

	@RequestMapping(value = "/getShopByPage", method = RequestMethod.GET)
	public void getShopByPage(int page, int offset) {

		shopService.getSHopByPage(page, offset);

	}

}
