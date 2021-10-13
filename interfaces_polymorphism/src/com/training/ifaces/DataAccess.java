package com.training.ifaces;

public interface DataAccess {
	
	boolean add(Object o);
	Object[] findall();
	Object findById(int id);
	int update(Object obj);
	int remove(Object obj);

}
