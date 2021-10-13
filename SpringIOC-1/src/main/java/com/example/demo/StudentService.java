package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



import lombok.*;
@Data
@Component    
/*
Class name first character in lower case will be the default bean name.
@Component("SS") to change the bean name.

*/
/*@Lazy if you didn't create the instance it will not call the constructor(Zero argument).
 * @Eager will be default. If you don't create also it will call constructor.
 */




public class StudentService {
	

	
	//Field DI with Qualifier

//	@Qualifier("ram")
//	private Student stud;
	
	@Autowired
	List<Student> studentList;
	
	
// Constructor DI with Qualifier
//	public StudentService(@Qualifier("ram") Student stud) {
//		super();
//		this.stud = stud;
//	}
	
	public StudentService() {
	super();
	System.out.println("==== Student Service Called =====");
	}

	

}
