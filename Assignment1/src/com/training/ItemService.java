package com.training;

public class ItemService {
	
//	public double rate=item.getRatePerUnit();

	double findDiscount(Item item) {
		
		double rate=item.getRatePerUnit();
		return (rate-.05*rate);
	}
	
	double findDiscount(Item item,Customer customer) {
		
		double rate=item.getRatePerUnit();
		
		if(customer.getType().toLowerCase().equals("corporate")) {
			
			return (rate-.15*rate);
		}
		else if(customer.getType().toLowerCase().equals("retails")) {
			
			return (rate-.10*rate);
		}
		else {
			return (rate-.05*rate);
		}
		
	}
}
