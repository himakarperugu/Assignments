package com.hexaware.restapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restapi.dto.CustomerDTO;
import com.hexaware.restapi.dto.ProductDTO;
import com.hexaware.restapi.entity.Customer;
import com.hexaware.restapi.entity.Product;
import com.hexaware.restapi.exception.ProductNotFoundException;
import com.hexaware.restapi.service.ICustomerService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {
	
	@Autowired
	ICustomerService service;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody CustomerDTO customerDTO) {

		return service.addCustomer(customerDTO);
	}

	@GetMapping("/get/{cid}")
	public CustomerDTO getById(@PathVariable @Valid @Min(1) int cid) { 

		CustomerDTO customerDTO = service.getById(cid);

		

		return customerDTO;
	}

	@GetMapping("/getall")
	public List<Customer> getAllCustomers() {
		
	   
		

		return service.getAllCustomers();
	}

	
	

}
