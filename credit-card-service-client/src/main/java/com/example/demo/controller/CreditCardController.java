package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CreditCardController {
	
	@Autowired
	RestTemplate template;
	
	String baseURL="http://localhost:9595/cards/";
	
	@GetMapping(path="/client/cards/{cardNumber}")
	public String getCardDetails(@PathVariable("cardNumber")int cardNumber) {
		
		String url=baseURL+cardNumber;
		
		return this.template.getForObject(url,String.class);
	}
	
	

}
