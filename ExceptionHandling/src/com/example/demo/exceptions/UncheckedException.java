package com.example.demo.exceptions;

public class UncheckedException extends RuntimeException {
	//unchecked exception
	private String message;

	public UncheckedException(String message) {
		super();
		this.message=message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception:"+message;
	}
	
	
	
	

}
