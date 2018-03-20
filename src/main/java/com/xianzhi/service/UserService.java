package com.xianzhi.service;

import java.util.List;

import com.xianzhi.bean.AdminUserBean;


public interface UserService {	
	public List<AdminUserBean> getUserByName(String name);
	
}