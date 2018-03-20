package com.xianzhi.utils;


import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

public class JwtFilter extends  BasicHttpAuthenticationFilter{
	
	
	/*
	 *判断用户是否尝试登陆，检测header里面是否包含Authorization字段即可
	 */
	
	@Override
	protected boolean isLoginAttempt(ServletRequest request, ServletResponse response) {
		HttpServletRequest req = (HttpServletRequest) request;
        String authorization = req.getHeader("Authorization");
        return authorization != null;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		
		 boolean bool = false;
	        try {
	            HttpServletRequest req = WebUtils.toHttp(request);
	            String firstLoginToken = req.getParameter("token");

	            //从token中获得信息
//	            Claims claims = TokenUtil.getClaims(firstLoginToken);
//	            String userCode = claims.getSubject();
//	            String userId = claims.getId();
//
//	            String redisLoginKey = "aum:token:" + userCode;
//	            String redisToken = JedisCacheUtil.get(redisLoginKey);
//	            if(!StringUtils.isBlank(redisToken)){
//	                String[] arrayRedisToken = redisToken.split("@");
//	                //将用户传过来的token和redis中的做对比，若一样，认为已经登录
//	                if (arrayRedisToken[0].equals(firstLoginToken)) {
//	                    //比较这次访问与登录的时间间隔有多少分钟,如果大于5分钟，则更新redis中的上次访问时间信息，将过期时间从新设定为30分钟
//	                    long diffMin = TokenUtil.CompareTime(arrayRedisToken[1]);
//	                    if (diffMin >= 5) {
//	                        String currentAccessTime = PasswordUtil.base64Encoede(String.valueOf(System.currentTimeMillis()));
//	                        //更新redis中的token登录信息
//	                        JedisCacheUtil.set(redisLoginKey, arrayRedisToken[0] + "@" + currentAccessTime, 30 * 60);
//	                    }
//	                    bool=true;
//	                }
//	            }
	        } catch (Exception e) {
	            return bool;
	        }
	        return bool;
	}

	
	
}
