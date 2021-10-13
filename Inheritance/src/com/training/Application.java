package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book headFirstJava = new Book(101,"Head Fist Java","Kathy Sieera",450.00);
		
		System.out.println(headFirstJava.toString());
		
		Insurance lifeInsurance =new Insurance(100,"Ramesh",200000.00);
		
		System.out.println("Expected:10000 Actual: "+lifeInsurance.calculatePremium());
		
		VehicleInsurance vInsurance=new VehicleInsurance(101,"suresh",60000,"bike");
		
		System.out.println("Expected:2000 Actual: "+vInsurance.calculatePremium());
		
				
	}

}
