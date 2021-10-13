package com.training;

public class Insurance {
	private int policyNumber;
	private String policyHolderName;
	private double policyAmount;
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	public Insurance(int policyNumber, String policyHolderName, double policyAmount) {
		super();
		System.out.println("3 param SUPER class constructor");
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
	}
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("0 param SUPER class constructor");
	}
	@Override
	public String toString() {
		return "Insurance [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName + ", policyAmount="
				+ policyAmount + "]";
	}
	
	
	public double calculatePremium() {
		
		double premium=5000.00;
		
		if(this.policyAmount>100000)
			premium=10000.00;
		
		return premium;
	}
	
	

}
