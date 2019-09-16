package com.own.crm.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.own.crm.domain.Customer;

/*
*@date   2018-06-01
*@author ChenJian
*/
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
	private Customer customer = new Customer();	
	@Override
	public Customer getModel() {
		 return customer;
	}

	

}
