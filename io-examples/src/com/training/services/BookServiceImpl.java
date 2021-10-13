package com.training.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.training.ifaces.BookService;
import com.training.model.Book;

public class BookServiceImpl implements BookService {
	
	/*
	 * if bookservice interface has the method with throws class 
	 * 	so we can override and add throws clause.
	 * 
	 * if bookservice interface not has the method with throws class 
	 * then we can override the method but IOexception handling not uses throws clause.
	 */

	@Override
	public boolean write(Book book) throws IOException {

		boolean result = false;
		try(PrintWriter writer = new PrintWriter(new FileWriter("book.txt",true))){
			writer.println(book.toString());
			result = true;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Book[] read() throws IOException {

		
		Book[] bookList = new Book[3];
		
		
		
		try(BufferedReader reader = new BufferedReader(new FileReader("book.txt"))){
			
			String line = null;
			
			int i=0;
			
			while((line= reader.readLine())!=null) {
				
				String[] values = line.split(",");
				
				
				Book book = new Book(Integer.parseInt(values[0]),values[1],Double.parseDouble(values[2]),values[3]);
				
				bookList[i]=book;
				
				i++;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return bookList;
	} 

}
