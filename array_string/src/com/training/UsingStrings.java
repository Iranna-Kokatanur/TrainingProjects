package com.training;

public class UsingStrings {
	
	public static void main(String[] args) {
		
		String city= "Hyderabad";
		
		String firstName = "Rajesh";
		
		String lastName  = "kanna";
		
		String college = "Ramaiah college";
		
		System.out.println("Length of City: "+city.length());
		
		System.out.println("upper :"+lastName.toUpperCase());
		
		System.out.println("substring: "+college.substring(6, 9));
		
		System.out.println("trim: "+college.trim().length());
		
		System.out.println("character: "+college.indexOf("m"));
		
		System.out.println("Index: "+college.charAt(0));
		
		
		
	}

}
