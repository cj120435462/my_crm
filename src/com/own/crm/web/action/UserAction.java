package com.own.crm.web.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.own.crm.domain.User;
import com.own.crm.service.UserService;

/*
*@date   2018-06-01
*@author ChenJian
*/
public class UserAction extends ActionSupport {
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//使用属性封装
	private String username;
	private String password;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//登录的方法
	public String login() {
		//封装实体类对象
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		//调用service方法
		User userExist = userService.login(user);
		System.out.println(user);
		//判断
		if(userExist != null) {//成功
			//使用session保存登录状态
			ServletActionContext.getRequest().getSession().setAttribute("user", userExist);
			return "loginSuccess";
		}
		return "login";
	}
}
