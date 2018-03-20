package com.xianzhi.dao;

import java.util.List;

import com.xianzhi.bean.AdminUserBean;

public interface UserDao {
	
	public List<AdminUserBean> getUserByName(String name);
	
}
