package com.example.legacy.threads;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Runnable counter = new Count();
//		
//		Thread t1 = new Thread(counter,"first");
//		
//		Thread t2 = new Thread(counter,"second");
//		
//		Thread t3 = new Thread(counter,"third");
//		
//		t1.start();
//		t2.start();
//		t3.start();
		
		try {
			Runnable tenCounter = new CountNumbers(10);
			Thread t4=new Thread(tenCounter,"tenCounter");
			t4.start();
			Thread.sleep(1600);
			
			Runnable hundredCounter = new CountNumbers(100);
			Thread t5=new Thread(hundredCounter,"hundredCounter");
			t5.start();
			Thread.sleep(1600);
			
			Runnable thousandCounter = new CountNumbers(1000);
			Thread t6=new Thread(thousandCounter,"thousandCounter");
			t6.start();
			Thread.sleep(1600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

}
