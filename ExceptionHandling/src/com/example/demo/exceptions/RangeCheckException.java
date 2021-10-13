package com.example.demo.exceptions;

//checked exception
public class RangeCheckException extends Exception {
	
	private String message;

	public RangeCheckException(String message) {
		super(message);
		this.message=message;
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception :"+message;
	}
	
	
	

}
