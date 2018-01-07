package epi.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,2);
		//ints.add(3.14); // Only typecasted values can be added! which is not a good practice!
		//List<Number> nums = ints; // Not allowed because List<Integer> is not a subtype of List<Number>
		// rather List<Integer> is a subtype of Iterable<Number> !!!
		
		List<Number> nums = new ArrayList<>();
		nums.add(1);
		nums.add(3.14);
		
		List<Number> num2 = new ArrayList<>();
		num2.addAll(ints);
		
		for(Number n: num2){
			System.out.println(n);
		}
		
	}
	
	
}
