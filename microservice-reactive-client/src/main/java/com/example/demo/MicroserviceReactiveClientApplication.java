package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MicroserviceReactiveClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceReactiveClientApplication.class, args);
	}
	
	    @Bean
	    @LoadBalanced        //Note This
	    WebClient.Builder builder() {
	        return WebClient.builder();
	    }
	    
	    @Bean
	    public WebClient client(WebClient.Builder builderRef) {
	        return builderRef.build();
	    }
	  

	

}
