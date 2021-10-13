package com.company;

public class Advocate implements Billable {

	@Override
	public double calculate(Object obj) {
		double amount=(double)obj;
		return amount*9*12;
	}

}
