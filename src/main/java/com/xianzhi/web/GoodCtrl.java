package com.xianzhi.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xianzhi.bean.GoodTypeBean;
import com.xianzhi.bean.GoodUnitBean;
import com.xianzhi.bean.GoodsBean;
import com.xianzhi.service.GoodsService;
import com.xianzhi.utils.HttpServletRequestUtil;

@RestController
@RequestMapping("/good")
public class GoodCtrl {

	@Autowired
	private GoodsService goodsService;

	/*
	 * ������Ʒ
	 */

	@RequestMapping(value = "/addGood", method = RequestMethod.POST)
	public void addGood(GoodsBean goods) throws JsonParseException, JsonMappingException, IOException {

		System.out.println(goods.getGoodOtherName());
		goodsService.insertGoods(goods);
	}

	/*
	 * ��ҳ��ѯ��Ʒ
	 */
	@RequestMapping(value = "/getGoodSByPage", method = RequestMethod.GET)
	@ResponseBody
	public List<GoodsBean> addGoodType(Integer page, Integer offset) {
		return goodsService.getGoodSByPage(page, offset);
	}

	/*
	 * ������Ʒ����
	 */

	@RequestMapping(value = "/addGoodType", method = RequestMethod.POST)
	public void addGoodType(String goodTypeName) {
		GoodTypeBean goodTypeBean = new GoodTypeBean();
		goodTypeBean.setGoodsTypeName(goodTypeName);
		goodsService.insertGoodType(goodTypeBean);
	}

	/*
	 * ������Ʒ��λ
	 * 
	 */

	@RequestMapping(value = "/addGoodUtil", method = RequestMethod.POST)
	public void addGoodUtil(String goodUnitName) {
		GoodUnitBean goodUnitBean = new GoodUnitBean();
		goodUnitBean.setGoodUnitName(goodUnitName);
		goodsService.insertGoodUnit(goodUnitBean);
	}

	/*
	 * ��ȡ��Ʒ����
	 * 
	 */

	@RequestMapping(value = "/getTotalGoodSize", method = RequestMethod.GET)
	@ResponseBody
	public int getTotalGoodSize(GoodUnitBean goodUnitBean) {
		return goodsService.getTotalGoodSize();
	}

	/*
	 * ��ȡ����Ʒ����
	 * 
	 */

	@RequestMapping(value = "/getAllGoodType", method = RequestMethod.GET)
	@ResponseBody
	public List<GoodTypeBean> getAllGoodType() {
		return goodsService.getAllGoodType();
	}

	/*
	 * ��ȡ����Ʒ��λ
	 * 
	 */

	@RequestMapping(value = "/getAllGoodUnit", method = RequestMethod.GET)
	@ResponseBody
	public List<GoodUnitBean> getAllGoodUnit() {
		return goodsService.getAllGoodUnit();
	}

	/*
	 * ������Ʒ����
	 * 
	 */

	@RequestMapping(value = "/updateGoodType", method = RequestMethod.POST)
	@ResponseBody
	public int updateGoodType(String goodTypeName) {
		GoodTypeBean goodTypeBean = new GoodTypeBean();
		goodTypeBean.setGoodsTypeName(goodTypeName);
		return goodsService.updateGoodType(goodTypeBean);
	}
	
	/*
	 * ��ID��Ʒ��Ʒ����
	 * 
	 * */
	
	@RequestMapping(value = "/deleteGoodTypeById", method = RequestMethod.POST)
	@ResponseBody
	public int deleteGoodTypeById(int id) {
		return goodsService.deleteGoodType(id);
	}
}
