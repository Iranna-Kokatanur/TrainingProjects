package com.training;

public class Apperal extends Product {
	
	private int size;
	private String material;
	public Apperal(int itemCode, String itemName, double quantity, double unitPrice, int size, String material) {
		super(itemCode, itemName, quantity, unitPrice);
		this.size = size;
		this.material = material;
	}
	
	
	
	
	
}
	


