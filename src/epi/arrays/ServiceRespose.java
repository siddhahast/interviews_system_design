package epi.arrays;

import java.util.ArrayList;
import java.util.List;

public class ServiceRespose<X extends ServiceData> {

	private X x;
	private List<X> listX;
	
	public <X> ServiceRespose(){
		this.listX = new ArrayList<>();
	}
	
	public X getX(){
		return x;
	}
	
	public void add(X x){
		listX.add(x);
	}
	
	public void addAll(List<X> sList){
		listX.addAll(sList);
	}
}
