package com.training;

import com.training.ifaces.Ifunction;

public class Application {
	
	public static void print(Ifunction func,double arg ) {
		
		System.out.println(func.apply(arg));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrencyConverter inrToUsd = new CurrencyConverter();
		
		System.out.println(inrToUsd.apply(100));
		
		TempConverter farToCel = new TempConverter();
		
		System.out.println(farToCel.apply(98.6));
		
		print(farToCel,98.6);
	}

}
