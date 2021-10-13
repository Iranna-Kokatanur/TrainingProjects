package com.examples.demo;

import java.util.*;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;

import com.examples.demo.utils.DbConnection;
import com.training.daos.StudentDaosImpl;
import com.training.entity.Student;
import com.training.ifaces.CrudRepository;

public class Application {

	public static void main(String[] args) {
		
		
		System.out.println(DbConnection.getOracleConnection());
		
		Connection con = DbConnection.getOracleConnection();
		
		CrudRepository<Student,Integer>repo = new StudentDaosImpl(con);
		
		Student ram = new Student(101, "Ramesh", LocalDate.of(1997, 8, 10), 90);
		Student sur = new Student(102, "Suresh", LocalDate.of(1998, 8, 10), 80);
		Student kar = new Student(103, "kartik", LocalDate.of(1998, 8, 10), 80);
		
		int key=2;
		if(key==1) {
		repo.add(ram);
		repo.add(sur);
		boolean result = repo.add(kar);
		
	
		if(result) {
	     System.out.println(repo.rowsAdded()+" Student row Added");
		}
	}
		if(key==2) {
		List<Student>list=repo.findAll();
		
		for(Student s:list) {
			System.out.println(s);
		}
	}
		
		if(key==3) {
			
			Student obj=repo.findById(103);
			
			System.out.println(obj);
			
		}
      if(key==4) {
			
    	  Student k = new Student(101, "Ramesh", LocalDate.of(1997, 8, 10), 90);
    	  
    	  boolean r=repo.remove(k);
    	  
    	  if(r) {
    		  System.out.println("1 row deleted");
    	  }	
		}
      
      if(key==5) {
			
    	  //Student k = new Student(104, "SureshGowda", LocalDate.of(1999, 9, 10), 85);
 Student k = new Student(102, "SureshGowda", LocalDate.of(1999, 9, 10), 85);
    	  int r=repo.update(k);
    	  
 
    		  System.out.println(r +" row updated");
    	 
		}
		
	
		
		

	}

}
