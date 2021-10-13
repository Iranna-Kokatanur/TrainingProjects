package com.example.legacy.threads;

public class SynchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new PrintStringTask("Idly", "Sambar");
		new PrintStringTask("Pizza", "Coke");
		new PrintStringTask("Paratha", "Achar");
		new PrintStringTask("Tea", "Biscuit");

	}

}
