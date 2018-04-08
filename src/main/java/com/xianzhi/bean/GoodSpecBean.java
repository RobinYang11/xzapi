package com.xianzhi.bean;

/*
 * 产品规格实体类
 *
 */

public class GoodSpecBean {

	private int id;
	private String goodSpecPrice;
	private String specifications;
	private int good;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 

	public String getGoodSpecPrice() {
		return goodSpecPrice;
	}

	public void setGoodSpecPrice(String goodSpecPrice) {
		this.goodSpecPrice = goodSpecPrice;
	}

	public String getSpecifications() {
		return specifications; 
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

}
