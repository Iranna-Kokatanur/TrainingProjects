package com.training.ifaces;

import java.util.*;



public interface CrudRepository<T,E>{
	
	public boolean add(T t); // create
	public List<T> findAll();   // find
    public int update(T t);  //update
    public boolean remove(T t); //remove
	int rowsAdded();
	T findById(E e);

}
