package com.example.legacy.threads;

public class JoinApplication {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.out.println("main started");
		
		TaskForJoin task = new TaskForJoin();
		
		Thread t1= new Thread(task);
		
		t1.start();
		try {
			t1.join();// it will stop the main thread to complete its process. Later it 
			//will provide the access to the main thread
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main finished");

	}

}
