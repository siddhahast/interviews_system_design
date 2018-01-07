package com.ds;

public class HeapPrac {

	private int[] arr;
	private int size;
	private int elems;
	
	public void createHeap(int size)
	{
		this.size = size;
		arr = new int[size];
		elems = 0;
	}
	
	public void heapify()
	{
		for(int i=0;i<elems/2;i++)
		{
			
		}
	}
	
	public void add(int data)
	{
		if(elems<size){
			arr[elems] = data;
			elems++;
		}
		heapify();
	}
}
