package com.xianzhi.utils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.session.SessionException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;

public class SysLogoutFilter extends LogoutFilter {

	@Override
	protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
		
		Subject subject = getSubject(request, response);
	
		try {
			subject.logout();
		} catch (SessionException ise) {
			ise.printStackTrace();
		}
		return false;
	}

	
}
