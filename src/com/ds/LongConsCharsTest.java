package com.ds;

public class LongConsCharsTest {

	public static void main(String[] args) {
		
		String test = "aabbaccbbbaa";
		LongestConsecutiveCharacters util = new LongestConsecutiveCharacters();
		util.calculateLongestConsCharacters(test);
		System.out.println("Frequency ::: "+util.getCh());
		System.out.println("Letter ::: "+util.getFreq());
		
	}
	
}
