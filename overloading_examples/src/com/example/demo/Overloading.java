package com.example.demo;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram=new Student(101,90,"ram@abc.com","Ramesh");
		
		Student shyam=new Student(102,70,"Shyam@abc.com","Shyam");
		
		StudentService service=new StudentService();
		
		System.out.println("expect => grade o= "+service.assignGrade(ram));
		
		System.out.println("expect => grade A= "+service.assignGrade(shyam, "Urban"));
		
		
	}

}
