package com.example.legacy.threads;

public class TaskForJoin implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Start Reading");
		
		try {
			System.in.read();
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		System.out.println("finished reading");

	}

}
