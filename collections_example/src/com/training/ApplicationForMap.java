package com.training;

import java.util.HashMap;

import com.training.model.Student;

public class ApplicationForMap {
	
	public static void main(String[] args) {
		
		Student ram0= new Student(114,922,"Sibas3hish1","siba12@abc.com");    
	    Student ram= new Student(111,92,"Sibashish1","siba1@abc.com");    
	    Student ram1= new Student(101,91,"Sibashish","siba@abc.com");
	    
	    HashMap<Integer, Student>list= new HashMap<>();
	    
	    list.put(200, ram0);
	    Object obj =list.put(201, ram);
	    Object obj1 =list.put(201, ram1);
	   
	   
	  
	    
	   System.out.println(list.get(200));
	   
	   //If key is unique and if it is not present in the hashmap then it returns null.
	   
	   System.out.println("obj is :"+obj);
	   
	   //If key is duplicate then it will overwrite it.
	   
	   System.out.println("obj2 is :"+obj1);
	    
	    
	    
	}

}
