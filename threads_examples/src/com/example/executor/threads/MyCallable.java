package com.example.executor.threads;

public class MyCallable implements java.util.concurrent.Callable<String> {
	
	private String message;
	
	

	public MyCallable(String message) {
		super();
		this.message = message;
	}



	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Hello -"+ message;
	}

}
