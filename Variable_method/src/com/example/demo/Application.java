package com.example.demo;

public class Application {
	
	public static void print(CreditCard card)
	{
		System.out.println(card.getCardHolderName());
		System.out.println(card.getCardNumber());
		System.out.println(CreditCard.getCardProvider());
		// static method has to be accessed with class name
//		System.out.println(CreditCard.)
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard card= new CreditCard(1010,"Girish");
		
		//since print is static method of same class, it can be invoked without class name 
		print(card);
		//Application.print(card);
		
		LocalandParameter obj=new LocalandParameter();
		
		obj.usingLocalVariable();
		
		obj.usingInstanceVariable();
		
		System.out.println(card.getCardHolderName());
		
		obj.usingParamVariable(card);// passing reference for class
		
//		CreditCard card2=obj.usingParamVariable(card);
//		
//		System.out.println(card2.getCardHolderName());
		
		System.out.println(card.getCardHolderName());
		
		int num=89;
		
		System.out.println("Number: "+num);
		
		obj.usingPrimitive(num);
		
		System.out.println("Number Again: "+num);
		
		
		

	}

}
