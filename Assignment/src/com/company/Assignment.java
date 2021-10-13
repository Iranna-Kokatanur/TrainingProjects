package com.company;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrencyConverter curr=new CurrencyConverter();
		
		System.out.println(curr.convert(73.68)+" usd");
		
		Employee emp=new Employee("Ashok",101,10000);
		
		System.out.println(emp.getSalary());
		
		
		emp.setSalary(100);
		
		System.out.println(emp.getSalary());
		
	}

}
