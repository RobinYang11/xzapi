package com.xianzhi.utils;


import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

public class JwtFilter extends  BasicHttpAuthenticationFilter{
	
	
	/*
	 *�ж��û��Ƿ��Ե�½�����header�����Ƿ����Authorization�ֶμ���
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

	            //��token�л����Ϣ
//	            Claims claims = TokenUtil.getClaims(firstLoginToken);
//	            String userCode = claims.getSubject();
//	            String userId = claims.getId();
//
//	            String redisLoginKey = "aum:token:" + userCode;
//	            String redisToken = JedisCacheUtil.get(redisLoginKey);
//	            if(!StringUtils.isBlank(redisToken)){
//	                String[] arrayRedisToken = redisToken.split("@");
//	                //���û���������token��redis�е����Աȣ���һ������Ϊ�Ѿ���¼
//	                if (arrayRedisToken[0].equals(firstLoginToken)) {
//	                    //�Ƚ���η������¼��ʱ�����ж��ٷ���,�������5���ӣ������redis�е��ϴη���ʱ����Ϣ��������ʱ������趨Ϊ30����
//	                    long diffMin = TokenUtil.CompareTime(arrayRedisToken[1]);
//	                    if (diffMin >= 5) {
//	                        String currentAccessTime = PasswordUtil.base64Encoede(String.valueOf(System.currentTimeMillis()));
//	                        //����redis�е�token��¼��Ϣ
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
