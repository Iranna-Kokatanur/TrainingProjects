package com.example.demo;


/*
 * right click,run as,run configuration, args, run	
 */
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rollnumber= Integer.parseInt(args[0]);
		
		String studentname=args[1];
		
		double markscored= Double.parseDouble(args[2]);
		
		String email = args[3];
		
		Student ram= new Student(rollnumber,markscored,email,studentname);
		
		System.out.println(ram.getMark_scored());
		
		int PhoneNumber=978978899;
		
		String strPhoneNumber=Integer.toString(PhoneNumber);
		
		System.out.println("Phone number:"+strPhoneNumber);
		
		System.out.println("Phone number:"+strPhoneNumber.length());
		

	}

}
