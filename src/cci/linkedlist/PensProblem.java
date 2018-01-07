package cci.linkedlist;

public class PensProblem {

	public static void main(String[] args) {
		int pens = 11;
		int packets[] = {1,2};
		
		boolean result = isCombinationPossible(pens, packets);
		System.out.println(result);
	}
	
	private static boolean isCombinationPossible(int pens, int[] packets){
		if(pens == 0){
			return true;
		}
		if(pens < 0){
			return false;
		}
		for(int index = 0;index<packets.length; index++){
			boolean result = isCombinationPossible(pens- packets[index], packets);
			if(result){
				return true;
			}
		}
		return false;
	}
}
