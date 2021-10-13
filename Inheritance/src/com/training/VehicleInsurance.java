package com.training;

public class VehicleInsurance extends Insurance {
	
	private String vehicleType;

	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("0 param sub class constructor");
	}

	public VehicleInsurance(int policyNumber, String policyHolderName, double policyAmount, String vehicleType) {
		super(policyNumber, policyHolderName, policyAmount);
		System.out.println("4 param sub class constructor");
		this.vehicleType = vehicleType;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	

	@Override
	public double calculatePremium() {
		
		double premium=100.00;
		
		switch(vehicleType.toLowerCase()) {
		case "car":
			if(getPolicyAmount()>=50000)
				premium=1000;
			break;
		case "bike":
			if(getPolicyAmount()>=50000)
				premium=2000;
			break;
		
		}
		return  premium;
	}

	@Override
	public String toString() {
		return "VehicleInsurance [vehicleType=" + vehicleType + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

	
	
	

}
