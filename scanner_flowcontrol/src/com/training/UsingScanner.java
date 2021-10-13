package com.training;

import java.util.*;

public class UsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Roll no");
		
		int rollnumber=sc.nextInt();
		
        System.out.println("Enter the Name");
		
		String studentname=sc.next();
		
		//sc.nextLine() for space containing strings
		
        System.out.println("Enter the markscored");
		
		double markscored=sc.nextDouble();
		 
		
		System.out.println("Enter the email");
		
		String email =sc.next();
		
		
		Student ram=new Student(rollnumber,markscored,email,studentname);
		
		System.out.println(ram.getStudent_name()+" "+ram.getMark_scored());
		
		sc.close();
		

	}

}
