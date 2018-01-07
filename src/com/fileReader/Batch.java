package com.fileReader;

import java.util.ArrayList;
import java.util.List;

public class Batch<T, U extends PersonDao<T>> {

	T t;
	U u;
	private List<T> data;
	
	public void addAndSave(T t){
		if(data==null){
			data = new ArrayList<>();
		}
		data.add(t);
		if(data.size()>50){
			u.save(t);
		}
	}
	
	public void save(){
		
	}
	
}
