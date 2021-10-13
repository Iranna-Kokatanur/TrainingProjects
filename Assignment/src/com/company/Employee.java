package com.company;

public class Employee {
	
	String empname;
	int empid;
	double salary;
	
	public Employee() {
		
	}

	public Employee(String empname, int empid, double salary) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>5000)
			this.salary = salary;
		else
			System.out.println("Invalid");
	}

	
	
	

}
