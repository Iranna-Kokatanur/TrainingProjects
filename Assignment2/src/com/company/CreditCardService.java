package com.company;

public class CreditCardService {
	
	private static final CreditCard[][] CreditCard = null;

	private CreditCard[] creditcard;
	
	private int maxSize=2;
	private int count=0;

	public CreditCardService(CreditCard[] creditcard) {
		super();
		this.creditcard = creditcard;
	}
	
	

	public CreditCardService() {
		super();
		this.creditcard = new CreditCard[maxSize];
	}



	public CreditCard[] getCardDetails() {
		return this.creditcard;
	}
	
	public void addCardDetails(CreditCard card) {
		
		this.creditcard[count++]=card;
	}
	

}
