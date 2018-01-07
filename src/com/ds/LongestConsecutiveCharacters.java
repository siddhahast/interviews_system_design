package com.ds;

/*
 * This class will help us to get the characters which has the highest consecutive frequency in a string
 */
public class LongestConsecutiveCharacters {

	private int freq;
	private char ch;
	
	public int getFreq(){
		return freq;
	}
	
	public char getCh(){
		return ch;
	}

	/*
	 * Programming Question:
	 * We need to find the Longest consecutive characters in a given word.
	 * 
	 * Example :
	 * 			suppose we are given a word "aabbcaabbbcc"
	 *          In the above word the character 'b' appears 3 times consecutively at 5th place from the end of the string. 
	 */
	public void calculateLongestConsCharacters(String word) {
		if(word ==null){
			System.out.println("Word is null, not a valid test scenario");
		}
		int wordLength = word.length();
		char prev = 0;
		int maxIndex = 0;
		int tempArr[] = new int[wordLength];
		int index = 0;

		for (char c : word.toCharArray()) {
			if (c != prev) {
				prev = c;
				tempArr[index] = 1;
			} else {
				tempArr[index] = 1 + tempArr[index-1];
			}
			if(tempArr[index]>tempArr[maxIndex]){
				maxIndex = index;
			}
			index++;
		}
		
		freq = tempArr[maxIndex];
		ch = word.charAt(maxIndex);
	}

}
