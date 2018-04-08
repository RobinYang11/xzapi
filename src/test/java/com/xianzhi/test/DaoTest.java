package com.xianzhi.test;





import java.security.cert.PKIXRevocationChecker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mysql.fabric.xmlrpc.base.Data;
import com.xianzhi.bean.GoodPictureBean;
import com.xianzhi.bean.GoodTypeBean;
import com.xianzhi.bean.GoodUnitBean;
import com.xianzhi.bean.GoodsBean;
import com.xianzhi.bean.RoleBean;
import com.xianzhi.bean.ShopBean;
import com.xianzhi.bean.ShopPictureBean;
import com.xianzhi.bean.UserBean;
import com.xianzhi.dao.GoodTypeDao;
import com.xianzhi.dao.GoodUnitDao;
import com.xianzhi.dao.GoodsDao;
import com.xianzhi.dao.ShopDao;
import com.xianzhi.dao.UserDao;
import com.xianzhi.service.UserService;



@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:spring/spring-service.xml","classpath:spring/spring-dao.xml"}) 
public class DaoTest {
	
	@Autowired
	private UserService userDao;
	@Autowired
	private GoodsDao gd;
	@Autowired
	private GoodTypeDao gtd;
	@Autowired
	private GoodUnitDao gud;
	@Autowired
	private ShopDao sd;
	
	
	
	@Test
	public void run()
	{
		
		
		ShopBean shopBean=new ShopBean();
		shopBean=sd.getShopById(1);
		
		List<ShopPictureBean> shopPictureBeans=shopBean.getShopPics();
		
		for(ShopPictureBean i:shopPictureBeans)
		{
			System.out.println(i.getShopPictureName());
		}
		
		
//		GoodsBean gb=new GoodsBean();
//		
//		gb=gd.getGoodsById(1);
//		
//		List<GoodPictureBean> gPictureBeans=gb.getGoodPicture();
//		for(GoodPictureBean iBean :gPictureBeans)
//		{
//			System.out.println(iBean.getGoodPicPath());
//		}
//		
//		System.out.println("hello");
		
//		ShopBean shopBean =new ShopBean();
//		shopBean.setShopName("robinµê");
//		shopBean.setShopOnlineTime(new Date());
//		shopBean.setShopType("×âÓÃ");
//		
//		sd.insertShop(shopBean);
//		
		
		
//		GoodUnitBean goodUnitBean =new GoodUnitBean();
//		goodUnitBean.setGoodUnitName("Ç§¿Ë");
//		gud.insertGoodUnit(goodUnitBean);
//		
//		List<GoodUnitBean> goodUnitBeans;
//		goodUnitBeans=gud.getAllGoodUnit();
//		for(GoodUnitBean i: goodUnitBeans)
//		{
//			System.out.println(i.getGoodUnitName());
//		}
		
//		List<GoodsBean> GoodsBeans;
//		GoodsBean gBean=new GoodsBean();
//		GoodsBeans=gd.getGoodsBypage(gBean, 1, 4);
//		for(GoodsBean i:GoodsBeans)
//		{
//			System.out.println(i.getGoodName());
//		}
//		
//		GoodTypeBean goodTypeBean =new GoodTypeBean();
//		goodTypeBean.setGoodTypeName("Îå¹ÈÔÓÁ¸");
//		gtd.insertGoodType(goodTypeBean);
//    	List<GoodTypeBean> goodTypeBeans;
//    	goodTypeBeans=gtd.getAllGoodType();
//		for(GoodTypeBean i:goodTypeBeans)
//		{
//			System.out.println(i.getGoodsTypeName());
//		}
//		GoodTypeBean goodTypeBean=new GoodTypeBean();
//		goodTypeBean.setGoodTypeId(1);
//		GoodUnitBean goodUnitBean =new GoodUnitBean();
//		goodUnitBean.setGoodUnitId(1);
//		GoodsBean goodsBean=new GoodsBean();
//		ShopBean shopBean =new ShopBean();
//		shopBean.setShopId(1);
//		
//		goodsBean.setGoodName("Æ»¹û");
//		goodsBean.setGoodPrice(33.4);
//		goodsBean.setGoodType(goodTypeBean);
//		goodsBean.setGoodUnit(goodUnitBean);
//		goodsBean.setGoodShop(shopBean);
//		gd.insertGoods(goodsBean);
		
//		List<UserBean> userBeans =userDao.getUserByName("robin");
//		for(UserBean uBean :userBeans)
//		{
//			List<RoleBean> roleBeans=uBean.getRoles();
//			for(RoleBean rBean:roleBeans)
//			{
//				System.out.println(rBean.getRoleName());
//			}
//			System.out.println(uBean.toString());
//		}
	}
}
