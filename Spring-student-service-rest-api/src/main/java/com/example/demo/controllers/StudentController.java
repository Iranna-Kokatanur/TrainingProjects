package com.example.demo.controllers;

import java.util.List;

import javax.annotation.security.RolesAllowed;

//import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repos.StudentRepository;
import com.example.demo.services.StudentService;

@RestController
@RequestMapping(path ="/api/v1/students")
public class StudentController {
	
	private StudentService service;
	
	@Autowired
	public void setService(StudentService service) {
		
		this.service=service;
	}
	
	//Api/version number/entity class name should be in plural and lower case.
//	@GetMapping(path ="/api/v1/students") instead of writing path everywhere just write requestmapping as global.
	@GetMapping
	@RolesAllowed(value= {"ROLE_ADMIN"})
	public List<Student> findAll(){
		return this.service.findAll();
	}
	
	@RolesAllowed(value= {"ROLE_ADMIN","ROLE_GUEST"})
	@GetMapping(path = "/{rollNumber}")
	public Student findById(@PathVariable("rollNumber") int rollNumber) {
		return this.service.findById(rollNumber);
	}
	
	@GetMapping(path = "/srch/{name}")
	public List<Student> findByName(@PathVariable("name") String studentName) {
		return this.service.findByName(studentName);
	}
	
	@PutMapping(path = "/{rollNumber}/{markToUpdate}")
	public ResponseEntity<String> findById(@PathVariable("rollNumber") int rollNumber,@PathVariable("markToUpdate") double markToUpdate) {
		
		
		int count=this.service.updateMark(rollNumber, markToUpdate);
		return ResponseEntity.ok().body(count+" row updated");
	}
	
//	@PutMapping(path = "/{rollNumber}")
//	public ResponseEntity<String> DeleteById(@PathVariable("rollNumber")int rollNumber) {
//		
//		
//		int count=this.service.deletRow(rollNumber);
//		return ResponseEntity.ok().body(count+" row deleted");
//	}
//	
//	@PutMapping(path = "/name/{name}")
//	public ResponseEntity<String> DeleteById(@PathVariable("name")String name) {
//		
//		name=name.substring(0, 1).toUpperCase() + name.substring(1);
//
//		int count=this.service.deletRowByName(name);
//		return ResponseEntity.ok().body(count+" row deleted");
//	}
	
	@DeleteMapping(path="/{rollNo}")
	   public ResponseEntity<String> removeStudent(@PathVariable("rollNo") int rollNo){
	       int count = this.service.remove(rollNo);

	       if(count ==1) {
	          return ResponseEntity.ok().body(count +" deleted");

	       } else {
	          return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Record not found.");
	       }


	   }
//	@PostMapping(path ="/api/v1/students")
//	public Student add(@RequestBody  Student entity) {
//		
//		return this.service.addStudent(entity);
//	}
	@PostMapping
	public ResponseEntity<Student> add(@RequestBody  Student entity){
		Student addedEntity = this.service.addStudent(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);
		
	}
	
}
