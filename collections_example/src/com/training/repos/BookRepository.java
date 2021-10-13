package com.training.repos;

import java.util.*;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookRepository implements CrudRepository {
	
	private ArrayList<Book>bookList;
	
	

	public BookRepository() {
		super();
		this.bookList = new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {
		
		//type safety or generics prevents adding other objects other than Book.
		//this.bookList.add(new String("Hello"));
		
		return this.bookList.add(book);
	}

	@Override
	public List<Book> findAll() {
		
		
		return this.bookList;
	}

	@Override
	public int update(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

}
