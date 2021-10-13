package com.training.ifaces;

import java.util.*;

import com.training.model.*;

public interface CrudRepository {
	
	public boolean add(Book book); // create
	public List<Book> findAll();   // find
    public int update(Book book);  //update
    public boolean remove(Book book); //remove

}
