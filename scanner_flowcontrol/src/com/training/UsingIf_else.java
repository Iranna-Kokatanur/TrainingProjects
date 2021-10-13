package com.training;

/*
 * equals
 * Do-while and while
 * for loop
 * switch
 */

public class UsingIf_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark=56;
		
		System.out.println(mark>60);
		
		if(true) {
			System.out.println("Good Mark");
		}
		
		String message1 = "Hello World";
		
		String message2 = "Hello Hubli";
		
		System.out.println("Message with ="+(message1==message2));
		
		System.out.println("Message with equals ="+(message1.equals(message2)));
		
        String message3 = "Hello";
		
		String message4 = message3;
		
		System.out.println("Message with ="+(message3==message4));
		
		System.out.println("Message with equals ="+(message3.equals(message4)));
		
        String message5 = new String("Hello");
		
		String message6 = new String("Hello");
		
		System.out.println("Message with ="+(message5==message6));//it checks for the values
		
		System.out.println("Message with equals ="+(message5.equals(message6)));// for objects it will check that both are belonging to same location or not
		
		Student ram1=new Student(101,90,"x@c.com","Ram");
		
		Student ram2=new Student(101,90,"x@c.com","Ram");
		
		System.out.println("Message with equals ="+(ram1.equals(ram2)));// for objects it will check that both are belonging to same location or not
		
		

	}

}
