package com.company.demo;

public class CreditCard {
	
	private long cardNumber; //Instance Variable, default value is 0
	private String cardHolderName; //Instance Variable
	
	private static String cardProvider="visa"; //Class Variable
	
	public CreditCard() {
		super();
	}
	
	// card method is not added to constructor because it is as static 

	public CreditCard(long cardNumber, String cardHolderName) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public static String getCardProvider() {
		return cardProvider;
	}

	public static void setCardProvider(String cardProvider) {
		CreditCard.cardProvider = cardProvider;
	}
	
	

}

