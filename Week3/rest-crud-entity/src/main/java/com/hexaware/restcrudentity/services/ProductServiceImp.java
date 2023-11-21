package com.hexaware.restcrudentity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.hexaware.restcrudentity.entities.Product;
import com.hexaware.restcrudentity.repository.ProductRepository;
import com.hexaware.restcrudentity.entities.Product;
@Service
public class ProductServiceImp implements IProductService {

	
	@Autowired
	ProductRepository repo;
	
	

	@Override
	public Product insertEmployee(Product product) {
		
		return repo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {

		
		return repo.findAll();
	}

	@Override
	public Product updateProduct(Product product) {
	
		return repo.save(product);
	}

	@Override
	public Product getProductById(Long pid) {
	
		return repo.findById(pid).orElse(null);
	}

	@Override
	public void deleteProductById(Long pid) {
		 
		    repo.deleteById(pid);
		
	}

	@Override
	public Product getProductByPname(String pname) {
	
		return repo.findByPname(pname);
	}

	@Override
	public List<Product> getProductsByAmountGT(double amount) {
	
		return repo.findBySalaryGreaterThan(amount);
	}

	@Override
	public List<Product> getProductsGTSorted(double amount) {
		// TODO Auto-generated method stub
		return repo.getProductsSorted(amount);
	}

	@Override
	public List<Product> getSorted() {
		
		//return  repo.findAll(Sort.by("doj"));// select * from employee_details order by doj;
		
		return	repo.findAll(Sort.by(Direction.DESC, "doj"));
	}

	@Override
	public Product updateEmployee(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getEmloyeeById(Long pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(Long pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getEmployeeByEname(String pname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product insertProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
