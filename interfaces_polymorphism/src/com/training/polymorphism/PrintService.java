package com.training.polymorphism;

import com.training.ifaces.Condition;

public class PrintService {
	
//	public static void print(Student obj) {
//		
//		System.out.println(obj.test());
//	}
//	
//   public static void print(Professor obj) {
//		
//		System.out.println(obj.test());
//	}
     public static void print(Condition obj) {
		
		System.out.println(obj.test());
	}
     
     public static void print(Condition[] li) {
 		
// 		System.out.println(obj.test());
    	 
    	 for(Condition each:li) {
    		 System.out.println(each.test());
    	 }
 	 }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student(89);
		
		print(ram);
		
		Professor sham = new Professor("phd");
		
		print(sham);
		
		Student manish = new Student(49);
		
		Professor vimal =new Professor("be");
		
		Condition[] list= {ram,sham,manish,vimal};
		
		print(list);
		
		
		

	}

}
