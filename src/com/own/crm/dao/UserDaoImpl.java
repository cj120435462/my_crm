package com.own.crm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.own.crm.domain.User;

/*
*@date   2018-06-01
*@author ChenJian
*/
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	//登录的方法
	@Override
	public User find(User user) {
		//调用方法得到hibernateTemplate对象
		//HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
		//登录的查询操作
		//根据用户名和密码查询
		List<User> listUser = (List<User>) this.getHibernateTemplate().find
				("from User where username=? and password=?", user.getUsername(),user.getPassword());
		if(listUser != null && listUser.size() > 0) {
			return listUser.get(0);
		}
		return null;
	}

}
