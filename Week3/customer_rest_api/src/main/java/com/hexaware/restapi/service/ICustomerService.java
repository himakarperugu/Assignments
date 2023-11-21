package com.hexaware.restapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.restapi.dto.CustomerDTO;
import com.hexaware.restapi.entity.Customer;





public interface ICustomerService {

	
	public Customer addCustomer(CustomerDTO customerDTO);
	
	public CustomerDTO getById(int cid);
	
	public List<Customer> getAllCustomers();
	
}
