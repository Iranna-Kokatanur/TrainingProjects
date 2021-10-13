package com.example.demo.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.entity.Customer;
import com.example.entity.Product;

@Configuration
public class ApplicationConfig {
	
	
	//Factory Method 	
	@Bean
	public Customer ram() {
		return new Customer(101,"Ramesh",9840456789L);
	}
	
	@Bean
	public Customer shyam() {
		return new Customer(102,"ShyamSundar",9840456789L);
	}
	
	@Bean(name = "samsung") //tv name is replaced by samsung.
	public Product tv() {
		return new Product(202,"Samsung TV",23000);
	}
	
	@Bean
	public Bill inv() {
		
		return new Bill(tv(),ram());
		
	}
	
	@Bean(name = "ramsInvoice")
     public Invoice ramInv() {
		
		return new Invoice(tv(),ram());
		
	}
	

}
