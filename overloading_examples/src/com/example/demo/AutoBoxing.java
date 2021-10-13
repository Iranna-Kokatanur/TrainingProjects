package com.example.demo;


// right click on project,build path,change build path,java compiler, java version 1.4 to see the auto boxing working 
public class AutoBoxing {
	
	public static void print(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void printUsingWrapper(Integer a,Integer b) {
		System.out.println(a+b+100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(56,44);
		
		printUsingWrapper(56,44);//Java uses auto boxing to convert primitive 
	}

}
