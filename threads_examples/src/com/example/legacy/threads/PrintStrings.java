package com.example.legacy.threads;

public class PrintStrings {
	
	//Thread Synchronization
	public synchronized static void print(String str1,String str2) {
		
		
		System.out.println(str1);
		
		try {
			Thread.sleep(500);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(str2);
	}
	

}
