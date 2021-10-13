package com.training;

import java.io.IOException;
import com.training.ifaces.BookService;
import com.training.model.Book;
import com.training.services.BookServiceImpWithStream;
import com.training.services.BookServiceImpl;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BookService service = new BookServiceImpl();
		BookService obj1= new BookServiceImpWithStream();
			
			
		
		int key=4;
		
		try {
			switch (key) {
			case 1:
				Book book = new Book(101,"Head First Java",450,"kathysieera");
				boolean x= service.write(book);
				if(x) {
					System.out.println("file added");
				}
				break;
				
			case 2:
				Book[] list = service.read();
				
				for(Book eachBook:list) {
					if(eachBook!=null) {
						System.out.println(eachBook);
					}
				}
				
			case 3:
				Book jsBook= new Book(103, "javascript", 500, "paul");
				BookServiceImpWithStream obj = new BookServiceImpWithStream();
				boolean status = obj.write(jsBook);
				
				if(status) {
					System.out.println("one book serialized");
				}
				
			case 4:
				Book[] foundList= obj1.read();
				System.out.println(foundList[0]);
				break;
			default:
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		

	}

}
