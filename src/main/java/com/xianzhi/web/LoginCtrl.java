package com.xianzhi.web;



import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.SessionException;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.xianzhi.bean.ResponseBean;
import com.xianzhi.utils.HttpServletRequestUtil;
import com.xianzhi.utils.JWTUtil;

@RestController
@RequestMapping("/user")
public class LoginCtrl {
	@RequestMapping(value="/login",method = RequestMethod.POST)
	@ResponseBody
	public ResponseBean Login( String username ,String password)
	{
		 Subject cSubject =SecurityUtils.getSubject();
		 if(cSubject.isAuthenticated() == false)
		 {
			if(cSubject.hasRole("admin"))
			{
				 System.out.println("you hava the rights");
			}
			 UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			 try {
				 cSubject.login(token);
				 return new ResponseBean(200, "Login success", JWTUtil.sign("robin", "robin"));
			} catch (AuthenticationException e) {
				// TODO: handle exception
				System.out.println("##################################登录信息有错误");
				return new ResponseBean(200, "登录信息有错误", null);
			}
		 }
		return null;
	}

	@RequestMapping(value = "/logout")
	public ResponseBean loginOut(ServletRequest request, ServletResponse response) 
	{	
		Subject cSubject =SecurityUtils.getSubject();
		
		try {
			cSubject.logout();
		} catch (SessionException ise) {
			ise.printStackTrace();
		}
		return new ResponseBean(200, "Logout success", null);
	}
}
