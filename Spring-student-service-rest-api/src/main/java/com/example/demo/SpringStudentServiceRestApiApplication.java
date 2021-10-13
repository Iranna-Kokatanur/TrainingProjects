package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
//http://localhost:8080/swagger-ui.html
@OpenAPIDefinition(info=@Info(title="Student Management Service",version="1.0"))
public class SpringStudentServiceRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentServiceRestApiApplication.class, args);
	}

}
