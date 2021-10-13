package com.training;

import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.repos.BookRepository;
import com.training.utils.AuthorComparator;
import com.training.utils.BookNameComparator;

public class GandhiLibrary {
	
	public static void print(String message,List<Book>list) {
		
		System.out.println(message);
		
		for(Book eachBook:list) {
			System.out.println(eachBook);
		}
		
	}

	public static void main(String[] args) {
		
		//List allows duplicates	

		Book java = new Book(100, "Effective Java", 550, "Bruce");
		Book spring = new Book(101, "Spring in Action", 850, "Thomson");
		Book python = new Book(102, "Mastering Python", 950, "chadwick");
		
		
		CrudRepository repo = new BookRepository();
		
		repo.add(python);
		repo.add(spring);
		repo.add(java);
		
		List<Book> bookList = repo.findAll();
		
		for(Book eachBook:bookList) {
			System.out.println(eachBook);
		}
		
		System.out.println("**********************");
		System.out.println(bookList.get(2));
		System.out.println(bookList.size());
		System.out.println("**********************");
		bookList.set(1, python);
		for(Book eachBook:bookList) {
			System.out.println(eachBook);
		}
		System.out.println("**********************");
		
		Collections.sort(bookList);
		
		print("Sort By Book number",bookList);
		
		System.out.println("**********************");
		
		
		Collections.sort(bookList,new AuthorComparator());
		
		print("Sort By Author name",bookList);
		
		
		
		System.out.println("**********************");
		
		
		Collections.sort(bookList,new BookNameComparator());
		print("Sort By Book name",bookList);
		
		
		
		
		
		
		
		

	}

}
