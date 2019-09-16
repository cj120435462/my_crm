package com.own.crm.service;

import org.springframework.transaction.annotation.Transactional;

import com.own.crm.dao.UserDao;
import com.own.crm.domain.User;

/*
*@date   2018-06-01
*@author ChenJian
*/
@Transactional
public class UserService {
	private UserDao userDao;	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	//登录的方法
	public User login(User user) {
		//调用dao的查找用户方法
		return userDao.find(user);
	}

}
