package com.hexaware.restcrudentity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.restcrudentity.entities.Customers;

public interface CustomerRepository extends JpaRepository<Customers,Integer>{
	public Customers findByName(String name);
	
}
