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
import com.xianzhi.bean.GoodLabelBean;
import com.xianzhi.bean.GoodPictureBean;
import com.xianzhi.bean.GoodSizeBean;
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
	 * 增加商品规格
	 */

	@RequestMapping(value = "/addGood", method = RequestMethod.POST)
	public int addGood(GoodsBean goods) throws JsonParseException, JsonMappingException, IOException {
		  return goodsService.insertGoods(goods);
	}
	
	
	/*
	 * 增加商品规格
	 */
	@RequestMapping(value = "/addGoodSize", method = RequestMethod.POST)
	public int  addGoodSize(GoodSizeBean goodSizeBean) {
		return goodsService.addGoodSize(goodSizeBean);
	}
	
	/*
	 * 修改商品规格
	 */
	@RequestMapping(value = "/updateGoodSize", method = RequestMethod.POST)
	public int  updateGoodSize(GoodSizeBean goodSizeBean) {
		return goodsService.updateGoodSize(goodSizeBean);
	}
	
	
	/*
	 * 删除商品规格
	 */
	@RequestMapping(value = "/deleteGoodSize", method = RequestMethod.POST)
	public int  deleteGoodSize(int id) {
		return goodsService.deleteGoodSizeById(id);
	}
	
	
	/*
	 * 删除商品规格
	 */
	@RequestMapping(value = "/getGoodSizeByGoodId", method = RequestMethod.POST)
	public List<GoodSizeBean> getGoodSizeByGoodId(int goodId) {
		return goodsService.getGoodSizeByGoodId(goodId);
	}
	
	/*
	 * 增加商品图片
	 */
	@RequestMapping(value = "/addGoodPic", method = RequestMethod.POST)
	public int  addGoodImg(int goodId, MultipartFile file) {
		GoodPictureBean goodPictureBean =new GoodPictureBean();
		 return goodsService.addGoodPic(goodPictureBean);
	}
	
	/*
	 * 增加商品图片
	 */
	@RequestMapping(value = "/addGoodPic", method = RequestMethod.POST)
	public List<GoodPictureBean>  getGoodImgByGoodId(int goodId) {
		 return goodsService.getGoodPicByGoodId(goodId);
	}
	
	/*
	 * 更新商品图片
	 */
	@RequestMapping(value = "/updateGoodImg", method = RequestMethod.POST)
	public int updateGoodImg(int picId, MultipartFile file) {
		GoodPictureBean goodPictureBean =new GoodPictureBean();
		return goodsService.updateGoodPic(goodPictureBean);
	}

	/*
	 * 删除商品图片
	 */
	@RequestMapping(value = "/deleteGoodImg", method = RequestMethod.POST)
	public int  deleteGoodImg(int picId) {
		return goodsService.deleteGoodPicById(picId);
	}

	/*
	 * 分页查询商品
	 */
	@RequestMapping(value = "/getGoodSByPage", method = RequestMethod.GET)
	@ResponseBody
	public List<GoodsBean> addGoodType(Integer page, Integer offset) {
		return goodsService.getGoodSByPage(page, offset);
	}

	/*
	 * 按id查询商品
	 */
	@RequestMapping(value = "/getGoodsById", method = RequestMethod.GET)
	@ResponseBody
	public GoodsBean getGoodsById(Integer goodsId) {
		return goodsService.getGoodsById(goodsId);
	}

	/*
	 * 增加商品类型
	 */

	@RequestMapping(value = "/addGoodType", method = RequestMethod.POST)
	public void addGoodType(String goodTypeName) {
		GoodTypeBean goodTypeBean = new GoodTypeBean();
		goodTypeBean.setGoodsTypeName(goodTypeName);
		goodsService.insertGoodType(goodTypeBean);
	}

	/*
	 * 增加商品单位
	 * 
	 */

	@RequestMapping(value = "/addGoodUtil", method = RequestMethod.POST)
	public void addGoodUtil(String goodUnitName) {
		GoodUnitBean goodUnitBean = new GoodUnitBean();
		goodUnitBean.setGoodUnitName(goodUnitName);
		goodsService.insertGoodUnit(goodUnitBean);
	}

	/*
	 * 获取商品总数
	 * 
	 */

	@RequestMapping(value = "/getTotalGoodSize", method = RequestMethod.GET)
	@ResponseBody
	public int getTotalGoodSize(GoodUnitBean goodUnitBean) {
		return goodsService.getTotalGoodSize();
	}

	/*
	 * 获取总商品分类
	 * 
	 */

	@RequestMapping(value = "/getAllGoodType", method = RequestMethod.GET)
	@ResponseBody
	public List<GoodTypeBean> getAllGoodType() {
		return goodsService.getAllGoodType();
	}

	/*
	 * 获取总商品单位
	 * 
	 */

	@RequestMapping(value = "/getAllGoodUnit", method = RequestMethod.GET)
	@ResponseBody
	public List<GoodUnitBean> getAllGoodUnit() {
		return goodsService.getAllGoodUnit();
	}

	/*
	 * 更新商品分类
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
	 * 按ID删除商品分类
	 * 
	 * 
	 */

	@RequestMapping(value = "/deleteGoodTypeById", method = RequestMethod.POST)
	@ResponseBody
	public int deleteGoodTypeById(int id) {
		return goodsService.deleteGoodType(id);
	}

	/*
	 * 按ID更新商品单位
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
	 * 增加商品品牌
	 * 
	 */

	@RequestMapping(value = "/addGoodBrand", method = RequestMethod.POST)
	@ResponseBody
	public int addGoodBrand(MultipartFile file, String goodBrandName, String goodBrandDesc)
			throws IllegalStateException, IOException {

		String server = request.getServerName();
		String port = String.valueOf(request.getServerPort());

		String RealPath = PathUtil.getBaseImgPath();
		String imgPath = PathUtil.getBrandImgPath(goodBrandName.trim());
		PathUtil.makeDir(RealPath + imgPath);
		String imgName = ImageUtil.getRandomFileName() + ".png";
		String fullName = RealPath + imgPath + imgName;
		System.out.println(fullName);
		File tempFile = new File(fullName);
		file.transferTo(tempFile);

		GoodBrandBean goodBrandBean = new GoodBrandBean();
		goodBrandBean.setGoodBrandLogo(PathUtil.getVirtualPath(server, port, imgPath, imgName));
		goodBrandBean.setGoodBrandName(goodBrandName);
		goodBrandBean.setGoodBrandDesc(goodBrandDesc);
		return goodsService.addGoodBrand(goodBrandBean);
	}

	/*
	 * 获取所有品牌
	 * 
	 */

	@RequestMapping(value = "/getAllGoodBrand", method = RequestMethod.GET)
	@ResponseBody
	public List<GoodBrandBean> getAllGoodBrand() {

		return goodsService.getAllGoodBrand();

	}

	/*
	 * 获取所有商品标签
	 * 
	 */

	@RequestMapping(value = "/getAllGoodLabel", method = RequestMethod.GET)
	@ResponseBody
	public List<GoodLabelBean> getAllGoodLabel() {

		return goodsService.getAllGoodLabel();

	}

	/*
	 * 添加商品标签
	 * 
	 */

	@RequestMapping(value = "/addGoodLabel", method = RequestMethod.POST)
	@ResponseBody
	public int addGoodLabel(String goodLabelName, int priority) {

		GoodLabelBean goodLabelBean = new GoodLabelBean();
		goodLabelBean.setGoodLabelName(goodLabelName);
		goodLabelBean.setPriority(priority);
		return goodsService.addGoodLabel(goodLabelBean);

	}

	/*
	 * 更新商品标签
	 * 
	 */

	@RequestMapping(value = "/updateGoodLabel", method = RequestMethod.POST)
	@ResponseBody
	public int updateGoodLabel(Integer id, String goodLabelName, int priority) {

		GoodLabelBean goodLabelBean = new GoodLabelBean();
		goodLabelBean.setId(id);
		goodLabelBean.setGoodLabelName(goodLabelName);
		goodLabelBean.setPriority(priority);
		return goodsService.updateGoodLabel(goodLabelBean);
	}

	/*
	 * 删除商品标签
	 * 
	 */
	@RequestMapping(value = "/deleteGoodLabel", method = RequestMethod.GET)
	@ResponseBody
	public void deleteGoodLabel(int id) {

		goodsService.deleteGoodLabel(id);
	}

}
