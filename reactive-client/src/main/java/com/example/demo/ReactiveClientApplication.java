package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ReactiveClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveClientApplication.class, args);
	}

	@Bean
	WebClient.Builder builder(){
		return WebClient.builder();
	}
	
	@Bean
	WebClient client(WebClient.Builder bulidRef) {
		
		return bulidRef.build();
		
	}
}
