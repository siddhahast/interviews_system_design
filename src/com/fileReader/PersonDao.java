package com.fileReader;

public interface PersonDao<T> {

	public void save(T person);
	
}
