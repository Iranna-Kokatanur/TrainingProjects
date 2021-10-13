package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

	@Bean
	@Profile(value="dev")
	public Student ram() {
		
		return new Student(101,"ram", 80.08);
	}
	
	@Bean
	
	public Student shyam() {
		
		return new Student(102,"Shyam", 82.08);
	}
	
	@Bean
	@Profile(value="prod")
	public Student Bhama() {
		
		return new Student(103,"Bhama", 83.08);
	}
}
