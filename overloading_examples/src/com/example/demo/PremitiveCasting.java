package com.example.demo;

/* 
 * casting primitives
 * wrapper class
 * auto boxing
 * method overloading
 */

public class PremitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=23;

        long maxAge=age;// for upcasting, no explicit casting required ,int to Long
		
		long salaryPerMonth=55000;
		  
//		int salary= salaryPerMonth;
		
		int salary= (int)salaryPerMonth;// For downcasting, long to int casting is rquired
		
		System.out.println(salary);
		
		
		
		

	}

}
