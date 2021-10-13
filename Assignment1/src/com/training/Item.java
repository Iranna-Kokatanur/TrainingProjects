package com.training;

public class Item {

	private int itemId;
	private String itemName;
	private double ratePerUnit;
	private String category;
	
	public Item() {
		super();
	}

	public Item(int itemId, String itemName, double ratePerUnit, String category) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.ratePerUnit = ratePerUnit;
		this.category = category;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
