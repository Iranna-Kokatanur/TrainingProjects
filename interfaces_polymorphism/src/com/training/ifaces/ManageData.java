package com.training.ifaces;

public interface ManageData extends FindData {
	
	boolean add(Object o);
	int update(Object obj);
	int remove(Object obj);

}
