package com.training;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
//		 int itemId;
		String process = "continue";
//		 String itemName;
		
		while(process.equals("continue")) {
		
	    
		System.out.println("enter item id");
		int itemId=sc.nextInt();
		System.out.println("enter item name");
		String itemName=sc.next();
		System.out.println("enter rate");
		double ratePerUnit=sc.nextDouble();
		System.out.println("enter category");
		String category=sc.next();
		System.out.println("enter customer type");
		String custType=sc.next();
		
		Item item=new Item(itemId,itemName,ratePerUnit,category);
		
		Customer cust=new Customer(custType);
		
		ItemService ser=new ItemService();
		
		System.out.println(ser.findDiscount(item));
		
		System.out.println(ser.findDiscount(item,cust));
		
		System.out.println("process");
		process=sc.next();
		
		
		
		
		}
		sc.close();
		

	}
	

}
