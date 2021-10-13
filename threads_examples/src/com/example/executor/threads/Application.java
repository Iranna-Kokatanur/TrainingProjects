package com.example.executor.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Runnable task1 = new PrintStringTask("idly","sambar");
		Runnable task2 = new PrintStringTask("pizza","coke");
		Runnable task3 = new PrintStringTask("paratha","achar");
		Runnable task4 = new PrintStringTask("tea","biscuit");
		
		Runnable[] taskList = {task1,task2,task3,task4};
		
		//Single thread is going to perform the tasks
		
//		ExecutorService service = Executors.newSingleThreadExecutor();
		
		//Multiple threads are going to perform the tasks
		
		ExecutorService service = Executors.newFixedThreadPool(2);
				
		
		for(Runnable eachTask:taskList) {
			
			service.submit(eachTask);
			
		}
		
		service.shutdown();
		
		

	}

}
