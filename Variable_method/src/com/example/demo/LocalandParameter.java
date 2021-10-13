package com.example.demo;

public class LocalandParameter {
	
    private int number=200;
	
	private static String name="Ramesh";
	
	public void usingLocalVariable() {
		int age=70; // local variable -> have to be initialized before use  and you can't 
		// use modifier for local variable
		
		System.out.println(age);
	}
	
	public void usingInstanceVariable() {
		
		System.out.println(number); // number is a instance variable
	}
	
	public CreditCard usingParamVariable(CreditCard card) {// passing argument -> Parameter Variable
		
		
		// Instance method can access both static and Instance methods
		System.out.println(name);
		
		card.setCardHolderName("Mr."+card.getCardHolderName());
		
		return card;
	}
	
	public int usingPrimitive(int num) {
		num=56;
		
		return num;
	}
	
	public static void usingInstance() {
		
		//static method can access only static variable and methods
		
		//System.out.println(number);
	}
}
