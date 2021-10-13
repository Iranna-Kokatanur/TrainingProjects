package com.example.demo.controllers;
import com.example.demo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path="/api/v1/client/students")//2020
public class ClientController {
	
	private static String baseuri="http://localhost:1010/api/v1/students"; 
	private WebClient client;
	
	@Autowired
	public void setClient(WebClient client) {
		
		this.client=client;
	}
	
	@GetMapping
	public Flux<String> getAllStudents(){
		
//		return client.get().uri(baseuri).headers(header->header.setBasicAuth("nepal","nepal")).retrieve().bodyToFlux(String.class);
		return client.get().uri(baseuri).retrieve().bodyToFlux(String.class);
		
	}
	@GetMapping(path = "/{rollNumber}")
	public Mono<String> getStudents(@PathVariable("rollNumber") int rollNumber){
		
		return client.get().uri(baseuri+"/"+rollNumber).retrieve().bodyToMono(String.class);
	}

	@PostMapping
	public Mono<String> addStudent(@RequestBody Student entity){
		return client.post().uri(baseuri).body(Mono.just(entity),Student.class).retrieve().bodyToMono(String.class);
	}
	
	@DeleteMapping(path="/{rollNumber}")
	public Mono<String> removeStudent(@PathVariable("rollNumber") int rollNumber){
		
		return client.delete().uri(baseuri+"/"+rollNumber).retrieve().bodyToMono(String.class);
	}
		
	@PutMapping(path="/{rollNumber}/{markToUpdate}")
	public Mono<String> updateStudent(@PathVariable("rollNumber") int rollNumber,@PathVariable("markToUpdate") double markToUpdate){
		
		return client.put().uri(baseuri+"/"+rollNumber+"/"+markToUpdate).retrieve().bodyToMono(String.class);
	}
		
		
		
	}

