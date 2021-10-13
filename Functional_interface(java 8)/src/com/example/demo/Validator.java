package com.example.demo;

public interface Validator {
	
    public boolean validate();
    
    public default String show() {
        return "Returned from default method";
    }
	

}
