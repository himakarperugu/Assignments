package com.hexaware.restcrudentity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.restcrudentity.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	public Product   findByPname(String pname); 
	
	
	
	public List<Product>  findBySalaryGreaterThan(double amount);
	
	
	@Query("select p from  Product p where e.amount > ?1  order by  p.pname")
	public List<Product>   getProductsSorted(double amount);
	
	
	
			
	
	

}
