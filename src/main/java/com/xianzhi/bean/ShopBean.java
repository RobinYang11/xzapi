package com.xianzhi.bean;

import java.util.Date;
import java.util.List;

public class ShopBean {

	private Integer shopId;
	private String shopName;
	private String shopArea;
	private Integer shopOwner;
	private String shopType;
	private String shopDesc;
	private Date shopRegisterTime;
	private Date shopOnlineTime;
	private int shopRentTime;
	private String shopStatus;
	private String shopStatusDesc;
	private List<ShopPictureBean> shopPics;

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Integer getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(Integer shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getShopDesc() {
		return shopDesc;
	}

	public void setShopDesc(String shopDesc) {
		this.shopDesc = shopDesc;
	}

	public Date getShopRegisterTime() {
		return shopRegisterTime;
	}

	public void setShopRegisterTime(Date shopRegisterTime) {
		this.shopRegisterTime = shopRegisterTime;
	}

	public Date getShopOnlineTime() {
		return shopOnlineTime;
	}

	public void setShopOnlineTime(Date shopOnlineTime) {
		this.shopOnlineTime = shopOnlineTime;
	}

	public int getShopRentTime() {
		return shopRentTime;
	}

	public void setShopRentTime(int shopRentTime) {
		this.shopRentTime = shopRentTime;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getShopStatusDesc() {
		return shopStatusDesc;
	}

	public void setShopStatusDesc(String shopStatusDesc) {
		this.shopStatusDesc = shopStatusDesc;
	}

	public String getShopArea() {
		return shopArea;
	}

	public void setShopArea(String shopArea) {
		this.shopArea = shopArea;
	}

	public List<ShopPictureBean> getShopPics() {
		return shopPics;
	}

	public void setShopPics(List<ShopPictureBean> shopPics) {
		this.shopPics = shopPics;
	}

}
