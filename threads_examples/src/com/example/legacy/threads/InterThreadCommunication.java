package com.example.legacy.threads;

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount();
		
		
		Thread t1 = new Thread() {
			public void run() {
				double amount=account.withdraw(2000);
				System.out.println("Amount after withdraw: "+amount);
			}
		};
		
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				double amount=account.deposit(4000);
				System.out.println("Amount after deposit: "+amount);
			}
		};
		
		t2.start();

	}

}
