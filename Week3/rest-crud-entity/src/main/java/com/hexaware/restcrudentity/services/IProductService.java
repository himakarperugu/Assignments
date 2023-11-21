package com.hexaware.restcrudentity.services;

import java.util.List;

import com.hexaware.restcrudentity.entities.Product;



public interface IProductService {

	public Product  insertEmployee(Product product);
	public Product  updateEmployee(Product product);
	
	
	public  Product  getEmloyeeById(Long pid);
	
	public void   deleteEmployeeById(Long pid);
	
	
	public Product  getEmployeeByEname(String pname);
	
	
	public List<Product>  getAllProducts();
	
	
	public List<Product>  getProductsByAmountGT(double amount);
	
	
	public List<Product>  getProductsGTSorted(double amount);
	
	
	public  List<Product>   getSorted();
	public Product getProductByPname(String pname);
	Product updateProduct(Product product);
	Product getProductById(Long pid);
	void deleteProductById(Long pid);
	public Product insertProduct(Product product);
	
	
	
	
}
