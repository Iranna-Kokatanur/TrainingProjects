package com.training.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.training.ifaces.BookService;
import com.training.model.Book;

public class BookServiceImpWithStream implements BookService {

	@Override
	public boolean write(Book book) throws IOException {
		// TODO Auto-generated method stub
		boolean result = false;
		
		try(ObjectOutputStream outStream = new ObjectOutputStream(
				new FileOutputStream(new File("book.ser")))){
			
			outStream.writeObject(book);// Implement serializable interface
			result= true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
		
	}

	@Override
	public Book[] read() throws IOException {
		// TODO Auto-generated method stub
		
		Book[] bookList = new Book[2];
		int i=0;
		
		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(
				new File("book.ser")))) {
			Book bk = (Book)inputStream.readObject();
			bookList[i]=bk;
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return bookList;
	}

}
