package com.xianzhi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xianzhi.bean.AdminUserBean;
import com.xianzhi.bean.UserBean;
import com.xianzhi.dao.UserDao;
import com.xianzhi.service.UserService;

@Service
public class UserServiceImp  implements  UserService{
	
	
	@Autowired
	private UserDao userdao;
	
	public List<AdminUserBean> getUserByName(String username) {
		// TODO Auto-generated method stub
		return userdao.getUserByName(username);
	}

}
