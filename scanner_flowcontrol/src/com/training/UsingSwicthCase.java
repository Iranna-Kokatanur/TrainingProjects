package com.training;

public class UsingSwicthCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String time="afternoon";
		
		//switch case with string is available from java 7 onwards
		
		switch(time) {
		
		case "morning":
			System.out.println("Good morning");
			break;
		case "afternoon":
			System.out.println("Good afternoon");
			break;
		case "evening":
			System.out.println("Good evening");
			break;
		default:
			System.out.println("hi");
			break;
		}

	}

}
