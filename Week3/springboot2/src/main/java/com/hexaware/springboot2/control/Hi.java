package com.hexaware.springboot2.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot2.entity.Product;

@Controller
@RequestMapping("/control")
public class Hi { 
	
	
		@RequestMapping("/hi")
		@ResponseBody
		public String sayHi() {
			
			
			return "<h1 style='color:blue'>Hello Friends</h1>";
			
		}
		
		@RequestMapping("get")
		@ResponseBody
		public String  getData() {
			
			
			Product prd = new Product();
			prd.setPid(1);
			prd.setPname("biryani");
		
			
			return prd.toString();
			
		}
	
	

}
