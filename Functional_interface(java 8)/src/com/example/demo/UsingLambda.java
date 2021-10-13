package com.example.demo;

import java.util.function.Predicate;

public class UsingLambda {
	
	public static void main(String[] args) {
		
		Runnable task = () ->{
			
			for(int i=1;i<=10;i++) {
				System.out.println(i+1);
			}
			
		};
		
		String name="Rameshkkkkk";
		
		Condition passMark = () -> name.length()>10;
		
		System.out.println(name.length()+" "+passMark.test());
		
		System.out.println(passMark.show());
		
		Predicate<Integer>isPassMark = (marks)-> marks>60;
		
		System.out.println("is pass mark: "+isPassMark.test(70));
		
		
		
      
	}

}
