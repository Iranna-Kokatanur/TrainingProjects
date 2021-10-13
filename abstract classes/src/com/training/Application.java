package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount account=new SavingsAccount(100, 1000, "ram");
		
		account.deposit(1000);
		account.deposit(5000);
		
		System.out.println("Expected 7000: Actual: "+account.getBalance());
		
		account.withdraw(2000);
		
		System.out.println("Expected 5000: Actual: "+account.getBalance());
		
		account.withdraw(4500);
		
		System.out.println("Expected 5000: Actual: "+account.getBalance());
		
//		System.out.println(account.showGreeting());
		
		BankAccount parent=new SavingsAccount(102, 2000, "vicky");
		
		System.out.println(((SavingsAccount)parent).showGreeting());
		

	}

}
