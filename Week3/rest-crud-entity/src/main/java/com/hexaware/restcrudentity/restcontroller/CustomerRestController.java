package com.hexaware.restcrudentity.restcontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hexaware.restcrudentity.entities.Customers;
import com.hexaware.restcrudentity.services.ICustomerService;
@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {
	@Autowired
	ICustomerService service;
	@GetMapping("/get/{customer_id}")
	public Customers getById(@PathVariable int customer_id) {

		return service.getCustomersById(customer_id);

	}
	@DeleteMapping("/delete/{customer_id}")
	public String deleteById(@PathVariable int customer_id) {

		service.deleteCustomersById(customer_id); 

		return "Record Deleted";

	}
	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public Customers addEmployee(@RequestBody Customers customer) {

		return service.insertCustomers(customer);

	}
	@GetMapping(value = "/getall", produces = "application/json")
	public List<Customers> getAll() {

		return service.getAllCustomers();

	}
	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public Customers updateEmployee(@RequestBody Customers customer) {

		return service.updateCustomers(customer);

	}
	
}
