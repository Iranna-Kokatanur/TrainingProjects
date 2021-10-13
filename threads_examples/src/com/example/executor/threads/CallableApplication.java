package com.example.executor.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class CallableApplication {

	public static void main(String[] args) {
		
		
		ExecutorService  service = Executors.newFixedThreadPool(4);
		
		
		Callable task = new MyCallable("Ramesh");
		
		Future<String> result = service.submit(task);
		
		try {
			System.out.println(result.get());
			System.out.println(result.isDone());
		} catch (InterruptedException | ExecutionException e) {
			
			e.printStackTrace();
		}
		
		service.shutdown();

	}

}
