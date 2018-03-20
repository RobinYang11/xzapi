package com.xianzhi.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xianzhi.bean.TestBean;
import com.xianzhi.service.TestService;

@Controller
@RequestMapping("/test")
public class TestCtrl {
	
	@Autowired
	private TestService testservice;
	
	@RequestMapping(value="test")
	public String Test() {
		List<TestBean> tb= new ArrayList<TestBean>();
		tb=testservice.getTest();
		return "test";
	}
	
}
