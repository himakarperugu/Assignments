package com.hexaware.restcrudentity.services;

import java.util.List;

import com.hexaware.restcrudentity.entities.Customers;


public interface ICustomerService {
	Customers  insertCustomers(Customers customer);
	 Customers  updateCustomers(Customers customer);
	 Customers  getCustomersById(int customer_id);
	 void   deleteCustomersById(int customer_id);
	 List<Customers>  getAllCustomers();
}
