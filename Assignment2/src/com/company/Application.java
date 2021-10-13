package com.company;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard ram =new CreditCard(100, "ramreddy");
		CreditCard sham =new CreditCard(200, "shamsharma");
		
		CreditCardService service= new CreditCardService();
		
		service.addCardDetails(sham);
		service.addCardDetails(ram);
		
		CreditCard[] array= service.getCardDetails();
		
		int count_sharma=0;
		
		int count_reddy=0;
		
		for(CreditCard card:array) {
			if(card.getCardHolderName().contains("sharma")) {
				count_sharma++;
			}
			if(card.getCardHolderName().contains("reddy")) {
				count_reddy++;
			}
			System.out.println(card.getCardHolderName());
			System.out.println(card.getCardNumber());
		}
		
		System.out.println(count_sharma+" "+count_reddy);
		
	}

}
