package com.hexaware.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restapi.dto.CustomerDTO;
import com.hexaware.restapi.entity.Customer;
import com.hexaware.restapi.entity.Product;
import com.hexaware.restapi.repository.CustomerRepository;




@Service
public class CustomerServiceImp implements ICustomerService {

	@Autowired
	CustomerRepository repo;
	
	
	
	
	@Override
	public Customer addCustomer(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		customer.setCname(customerDTO.getCname());
		customer.setEmail(customerDTO.getEmail());
		return repo.save(customer);
	}

	@Override
	public CustomerDTO getById(int cid) {
		Customer customer = repo.findById(cid).orElse(new Customer());
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCid(customer.getCid());
		customerDTO.setCname(customer.getCname());
		customerDTO.setEmail(customer.getEmail());
		
		return customerDTO;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

}
