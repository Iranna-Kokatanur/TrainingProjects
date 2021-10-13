package com.example.legacy.threads;

public class Count implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		}
		
	}

}
