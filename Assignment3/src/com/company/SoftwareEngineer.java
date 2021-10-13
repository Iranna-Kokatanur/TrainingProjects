package com.company;

public class SoftwareEngineer implements Billable {

	@Override
	public double calculate(Object obj) {

		double amount=(double)obj;
		return amount*8*12;
	}
	
	
	
}
