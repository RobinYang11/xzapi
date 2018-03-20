package com.xianzhi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xianzhi.bean.TestBean;
import com.xianzhi.dao.TestDao;
import com.xianzhi.service.TestService;

@Service
public class TestServiceImp  implements TestService{

	@Autowired
	private TestDao testdao;
	
	public List<TestBean> getTest() {
		// TODO Auto-generated method stub
		return testdao.getTest();
	}

}
