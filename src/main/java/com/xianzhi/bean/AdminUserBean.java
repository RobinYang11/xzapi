package com.xianzhi.bean;

import java.util.List;

public class AdminUserBean {

	private int userId;
	private String userName;
	private String passWord;
	private List<AdminRoleBean> roles;

	public List<AdminRoleBean> getRoles() {
		return roles;
	}

	public void setRoles(List<AdminRoleBean> roles) {
		this.roles = roles;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
