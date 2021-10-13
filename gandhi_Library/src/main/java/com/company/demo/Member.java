package com.company.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//import com.example.demo.Stu;

public class Member {
	
	HashMap<String,List<String>>details;
	
	private String name;
	
	 public Member(String name) {
		    this.name=name;
	        details= new HashMap<>();
	       
	        details.put("Mahesh",Arrays.asList("The truth","The Lie"));
	        details.put("Suresh",Arrays.asList("The Daring night","The Kite"));
	   
	    }
	    public List<String> findByName(String name) {
	    	
	        return details.get(name);
	    }
		public String getName() {
			return name;
		}
		
	    
	    

}
