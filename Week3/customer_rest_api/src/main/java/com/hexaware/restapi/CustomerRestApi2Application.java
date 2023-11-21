package com.hexaware.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CustomerRestApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRestApi2Application.class, args);
	}
	
}
