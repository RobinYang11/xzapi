package com.xianzhi.bean;

import java.util.Date;
import java.util.List;

public class GoodsBean {

	private int goodId;
	private GoodTypeBean goodType;
	private ShopBean goodShop;
	private String goodName;
	private String goodOtherName;
	private GoodUnitBean goodUnit;
	private Double goodPrice;
	private Double goodDiscount;
	private String goodStatus;
	private String goodBrand;
	private String goodRemark;
	private Date goodValidityPeriod;
	private String goodGrowPlace;
	private String goodManufacture;
	private List<GoodPictureBean> goodPicture;

	public int getGoodId() {
		return goodId;
	}

	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	public GoodTypeBean getGoodType() {
		return goodType;
	}

	public void setGoodType(GoodTypeBean goodType) {
		this.goodType = goodType;
	}

	public ShopBean getGoodShop() {
		return goodShop;
	}

	public void setGoodShop(ShopBean goodShop) {
		this.goodShop = goodShop;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getGoodOtherName() {
		return goodOtherName;
	}

	public void setGoodOtherName(String goodOtherName) {
		this.goodOtherName = goodOtherName;
	}

	public GoodUnitBean getGoodUnit() {
		return goodUnit;
	}

	public void setGoodUnit(GoodUnitBean goodUnit) {
		this.goodUnit = goodUnit;
	}

	public Double getGoodPrice() {
		return goodPrice;
	}

	public void setGoodPrice(Double goodPrice) {
		this.goodPrice = goodPrice;
	}

	public Double getGoodDiscount() {
		return goodDiscount;
	}

	public void setGoodDiscount(Double goodDiscount) {
		this.goodDiscount = goodDiscount;
	}

	public String getGoodStatus() {
		return goodStatus;
	}

	public void setGoodStatus(String goodStatus) {
		this.goodStatus = goodStatus;
	}

	public String getGoodBrand() {
		return goodBrand;
	}

	public void setGoodBrand(String goodBrand) {
		this.goodBrand = goodBrand;
	}

	public String getGoodRemark() {
		return goodRemark;
	}

	public void setGoodRemark(String goodRemark) {
		this.goodRemark = goodRemark;
	}

	public Date getGoodValidityPeriod() {
		return goodValidityPeriod;
	}

	public void setGoodValidityPeriod(Date goodValidityPeriod) {
		this.goodValidityPeriod = goodValidityPeriod;
	}

	public String getGoodGrowPlace() {
		return goodGrowPlace;
	}

	public void setGoodGrowPlace(String goodGrowPlace) {
		this.goodGrowPlace = goodGrowPlace;
	}

	public String getGoodManufacture() {
		return goodManufacture;
	}

	public void setGoodManufacture(String goodManufacture) {
		this.goodManufacture = goodManufacture;
	}

	public List<GoodPictureBean> getGoodPicture() {
		return goodPicture;
	}

	public void setGoodPicture(List<GoodPictureBean> goodPicture) {
		this.goodPicture = goodPicture;
	}

}
