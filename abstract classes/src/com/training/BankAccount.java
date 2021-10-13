package com.training;

public abstract class BankAccount {

	private long accountNumber;
	private double balance;
	
	public abstract double deposit(double amount);
	
	public abstract double withdraw(double amount);

	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	
//	public String showGreeting() {
//		
//		return "Welcome";
//	}
}
