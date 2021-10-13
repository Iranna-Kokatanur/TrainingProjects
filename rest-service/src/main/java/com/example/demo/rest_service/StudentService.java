package com.example.demo.rest_service;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.GET;

@Path(value = "students")
public class StudentService {
	
	@GET
	public String findAllStudents() {
		
		return "Ram,Shyama,Bhama";
	}

}
