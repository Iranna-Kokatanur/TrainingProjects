package com.training;

public class SavingsAccount extends BankAccount {

	private String nominee;
	
	
	
	public SavingsAccount(long accountNumber, double balance, String nominee) {
		super(accountNumber, balance);
		this.nominee = nominee;
	}

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		
		double currentBalance= getBalance();
		double updatedBalance = currentBalance+amount;
		setBalance(updatedBalance);
		return updatedBalance;
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		double currentBalance= getBalance();
		if(currentBalance-amount>1000) {
			setBalance(currentBalance-amount);
		}
		else {
			System.out.println("minimum balance should be maintained");
		}
		return getBalance();
		
		
		
	}
	public String showGreeting() {
		
		return "Welcome";
	}

}
