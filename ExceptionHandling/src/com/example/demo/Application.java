package com.example.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.example.demo.exceptions.RangeCheckException;
import com.example.demo.exceptions.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyExceptionHandler handler = new MyExceptionHandler();
		
//		handler.usingClassCastException();
		
//		handler.multipleCatch(null);
		
//		handler.multipleCatch("45");
		
		
		
		try(Scanner sc= new Scanner(System.in);){
			System.out.println("Enter the Choice");
			
			int key=sc.nextInt();
			switch (key) {
			case 1:
				handler.usingClassCastException();
				break;
			case 2:
				handler.multipleCatch("45");
				break;
			case 3:
				handler.multipleCatch(null);
				break;
			case 4:
				handler.tryWithMultipleCatch();
				break;
			case 5:
				handler.usingFinallyBlock();
				break;
				
			case 6:
				Student ram=new Student();
				ram.setMark_scored(89);
				System.out.println(ram.getMark_scored());
				
				break;
				
			case 7:
				Student sham = new Student(202, 200, "sham@abc.com", "sham");
				System.out.println(sham);
				
			case 8:
				Student sam = new Student();
				sam.setEmail("samabc.com");
				
			default:
				break;
			}
		} catch (InputMismatchException | RangeCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
