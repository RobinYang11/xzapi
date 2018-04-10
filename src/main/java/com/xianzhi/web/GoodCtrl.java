package com.xianzhi.web;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.xianzhi.bean.GoodBrandBean;
import com.xianzhi.bean.GoodTypeBean;
import com.xianzhi.bean.GoodUnitBean;
import com.xianzhi.bean.GoodsBean;
import com.xianzhi.service.GoodsService;
import com.xianzhi.utils.ImageUtil;
import com.xianzhi.utils.PathUtil;

@RestController
@RequestMapping("/good")
public class GoodCtrl {

	@Autowired
	private GoodsService goodsService;
	@Autowired
	private HttpServletRequest request;
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
	 * ��id��ѯ��Ʒ
	 */
	@RequestMapping(value = "/getGoodsById", method = RequestMethod.GET)
	@ResponseBody
	public GoodsBean getGoodsById(Integer goodsId) {
		return goodsService.getGoodsById(goodsId);
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
	public int updateGoodType(int id, String goodTypeName) {
		GoodTypeBean goodTypeBean = new GoodTypeBean();
		goodTypeBean.setGoodsTypeName(goodTypeName);
		goodTypeBean.setGoodsTypeId(id);
		return goodsService.updateGoodType(goodTypeBean);
	}

	/*
	 * ��IDɾ����Ʒ����
	 * 
	 * 
	 */

	@RequestMapping(value = "/deleteGoodTypeById", method = RequestMethod.POST)
	@ResponseBody
	public int deleteGoodTypeById(int id) {
		return goodsService.deleteGoodType(id);
	}

	/*
	 * ��ID������Ʒ��λ
	 * 
	 */

	@RequestMapping(value = "/updateGoodUnitById", method = RequestMethod.POST)
	@ResponseBody
	public int updateGoodUnitById(int id, String goodUnitName) {
		GoodUnitBean goodUnitBean = new GoodUnitBean();
		goodUnitBean.setGoodUnitId(id);
		goodUnitBean.setGoodUnitName(goodUnitName);
		return goodsService.updateGoodUnit(goodUnitBean);
	}

	/*
	 * ������ƷƷ��
	 * 
	 */

	@RequestMapping(value = "/addGoodBrand", method = RequestMethod.POST)
	@ResponseBody
	public int addGoodBrand(MultipartFile file, String goodBrandName,String goodBrandDesc) throws IllegalStateException, IOException {
		
		String server=request.getServerName();
		String port=String.valueOf(request.getServerPort());
		
		String RealPath=PathUtil.getBaseImgPath();
		String imgPath=PathUtil.getBrandImgPath(goodBrandName);
		PathUtil.makeDir(RealPath+imgPath);
		String imgName = ImageUtil.getRandomFileName()+".png";
	    String fullName = RealPath+imgPath + imgName;
	    System.out.println(fullName);
	    File tempFile = new File(fullName);
		file.transferTo(tempFile);
		
		GoodBrandBean goodBrandBean = new GoodBrandBean();
		goodBrandBean.setGoodBrandLogo(PathUtil.getVirtualPath(server, port,imgPath, imgName));
		goodBrandBean.setGoodBrandName(goodBrandName);
		goodBrandBean.setGoodBrandDesc(goodBrandDesc);
		return goodsService.addGoodBrand(goodBrandBean);
	}
	

	/*
	 * ��ȡ����Ʒ��
	 * 
	 */

	@RequestMapping(value = "/getAllGoodBrand", method = RequestMethod.GET)
	@ResponseBody
	public List<GoodBrandBean> getAllGoodBrand() {
		
		return goodsService.getAllGoodBrand();
		
	}

}
