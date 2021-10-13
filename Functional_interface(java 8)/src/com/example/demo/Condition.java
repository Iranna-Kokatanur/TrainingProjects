package com.example.demo;


@FunctionalInterface
public interface Condition {
	
	public boolean test();
	
	default String show() {
		
		return "I am from default method";
		
	}
	

}
