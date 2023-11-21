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

import com.hexaware.restcrudentity.entities.Product;
import com.hexaware.restcrudentity.services.IProductService;



@RestController
@RequestMapping("/api/products")
public class ProductRestController {

	@Autowired
	IProductService service;

	@GetMapping("/get/{pid}")
	public Product getById(@PathVariable Long pid) {

		return service.getProductById(pid);

	}

	
		@GetMapping("/getbypname/{pname}")
		public Product   getByPname(@PathVariable String pname) {
			
			return service.getProductByPname(pname);
			
		}
	
		@GetMapping("/get/amountgt/{amount}")
		public List<Product>  getByAmountGT(@PathVariable  double amount){
			
			return  service.getProductsByAmountGT(amount);
			
		}
		
		
		@GetMapping("/get/sorted/{salary}")
		public List<Product>  getByAmountGTSorted(@PathVariable  double amount){
			
			return  service.getProductsGTSorted(amount);
			
		}
		
		
		
		
		@GetMapping("/get/sorted/dom")
		public List<Product>  getBySorted(){
			
			return  service.getSorted();
			
		}
		
		
	
		
		
	
	@DeleteMapping("/delete/{pid}")
	public String deleteById(@PathVariable Long pid) {

		service.deleteProductById(pid); // returns void

		return "Record Deleted";

	}

	@PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
	public Product addEmployee(@RequestBody Product product) {

		return service.insertProduct(product);

	}

	@GetMapping(value = "/getall", produces = "application/json")
	public List<Product> getAll() {

		return service.getAllProducts();

	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public Product updateEmployee(@RequestBody Product product) {

		return service.updateProduct(product);

	}

}

