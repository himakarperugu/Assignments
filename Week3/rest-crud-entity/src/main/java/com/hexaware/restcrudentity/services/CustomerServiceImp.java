package com.hexaware.restcrudentity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restcrudentity.entities.Customers;
import com.hexaware.restcrudentity.repository.CustomerRepository;
@Service
public class CustomerServiceImp implements ICustomerService {
	@Autowired
	CustomerRepository repo;

	@Override
	public Customers insertCustomers(Customers customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public Customers updateCustomers(Customers customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public Customers getCustomersById(int customer_id) {
		// TODO Auto-generated method stub
		return repo.findById(customer_id).orElse(null);
	}

	@Override
	public void deleteCustomersById(int customer_id) {
		// TODO Auto-generated method stub
		repo.deleteById(customer_id);
	}

	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	

}
