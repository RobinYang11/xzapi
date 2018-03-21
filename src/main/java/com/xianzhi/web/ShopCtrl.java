package com.xianzhi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xianzhi.bean.ShopBean;
import com.xianzhi.service.ShopService;

@RestController
@RequestMapping("/shop")
public class ShopCtrl {

	@Autowired
	private ShopService shopService;

	@RequestMapping(value = "/addShop", method = RequestMethod.POST)
	public int registerShop(ShopBean shopBean) {

		return shopService.insertSHop(shopBean);

	}

	@RequestMapping(value = "/getShopByPage", method = RequestMethod.GET)
	@ResponseBody
	public List<ShopBean> getShopByPage(Integer page, Integer offset) {
		List<ShopBean> sb;
		sb = shopService.getSHopByPage(page, offset);
		return sb;
	}

	@RequestMapping(value = "/getTotalShopSize", method = RequestMethod.GET)
	@ResponseBody
	public int getTotalShopSize() {

		return shopService.getTotalShopSize();

	}

}
