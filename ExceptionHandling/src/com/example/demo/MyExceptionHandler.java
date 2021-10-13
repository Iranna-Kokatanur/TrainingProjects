package com.example.demo;

public class MyExceptionHandler {

	//Example of unchecked exception -Runtime exception
	
	// All classes which extends run time exception are unchecked
	
	public void usingClassCastException() {
		
		Object ageObj= Integer.valueOf(20);
		
		
		
		try {
			Integer age = (Integer)ageObj;
			System.out.println(age);
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			System.out.println("age should be in the order[0 to 9]");
			e.printStackTrace();
		}
		
		
	}
	
	//super class exception not be at the first catch block
	
	public void multipleCatch(String num) {
		
		String[] value= {"ram","sham"};
		String val=null;
		
		try {
			int num1 = Integer.parseInt(num);
			System.out.println(num1);
			System.out.println(value[2]);
//			System.out.println(val.length());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("number should be in range of 0 to 9");
			e.printStackTrace();
		}catch (NullPointerException e) {
			
			System.out.println("Argument should not be null");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Handle other exceptions");
			e.printStackTrace();	
		}
	}
	
	public void tryWithMultipleCatch() {
		try {
			int numerator= 20;
			int[] denominator= {10,0};
			System.out.println(numerator/denominator[1]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void usingFinallyBlock() {
		
		try {
			int numerator= 20;
			int[] denominator= {10,0};
			System.out.println(numerator/denominator[1]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//Always finally block executes even it throws exception
			System.out.println("Inside Finally block");
		}
		
	}
		 
	
}
