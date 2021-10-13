package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import com.example.demo.model.CreditCard;

@SpringBootApplication
public class CreditCardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardServiceApplication.class, args);
	}
	
	@Bean
	@Order(value=1)
	public CreditCard card1() {
		
		return new CreditCard(884,"Jagan",80000);
	}
	
	@Bean
	@Order(value=2)
	public CreditCard card2() {
		
		return new CreditCard(984,"Chandan",95000);
	}

}
