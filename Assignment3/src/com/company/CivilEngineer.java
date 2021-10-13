package com.company;

public class CivilEngineer implements Billable {

	@Override
	public double calculate(Object obj) {
		
		double amount=(double)obj;
		return amount*7*12;
	}

}
