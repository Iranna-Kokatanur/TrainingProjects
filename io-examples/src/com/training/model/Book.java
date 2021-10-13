package com.training.model;

import java.io.Serializable;

public class Book implements Serializable{
	
	private int bookNumber;
	private String bookName;
	private double price;
    private String author;
	public Book(int bookNumber, String bookName, double price, String author) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return bookNumber + "," + bookName + "," + price + ","+ author;

	}
    

}
