package com.xianzhi.realm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;

import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.xianzhi.bean.AdminRoleBean;
import com.xianzhi.bean.AdminUserBean;
import com.xianzhi.bean.RoleBean;
import com.xianzhi.bean.UserBean;
import com.xianzhi.service.UserService;


public class CustomRealm  extends AuthorizingRealm{
	
	@Autowired
	private UserService userservice;
	
	

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection tk) {
		// TODO Auto-generated method stub
		String username=tk.toString();
		SimpleAuthorizationInfo info = null;
		
		Set<String> roles =new HashSet<String>();
		List<AdminUserBean> users=userservice.getUserByName(username);
		for(AdminUserBean i:users)
		{
			for(AdminRoleBean rBean :i.getRoles())
			{
				String role=rBean.getRoleName();
				roles.add(role);
			}
		}
		
		info=new SimpleAuthorizationInfo(roles);
		return info;
	}
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken tk) throws AuthenticationException {
		// TODO Auto-generated method stub
		UsernamePasswordToken token =(UsernamePasswordToken) tk;

		String username=token.getUsername();
		
		List<AdminUserBean> users=userservice.getUserByName(username);
		AdminUserBean user=users.get(0);
	
		
		if(null!=user)
		{
			  AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUserName(), user.getPassWord(), "peng");
			  return authenticationInfo;
		}
		return null;
	}

}
