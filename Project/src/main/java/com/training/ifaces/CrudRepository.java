package com.training.ifaces;

import java.time.LocalDate;
import java.util.*;

import javax.naming.NameNotFoundException;



public interface CrudRepository<T,E>{
	
	public boolean add(T t); // create
	public List<T> findAll();
	public List<T> findByName(String firstName,String lastName) throws NameNotFoundException;// find
	public List<T> findByWeddingDate(LocalDate date);
	public List<T> findByBirthDate(LocalDate date);
    public int updateOrAdd(T t);  //update
    public boolean remove(E e); //remove
	
	T findById(E e);

}
