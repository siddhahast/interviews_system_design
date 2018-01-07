package com.hackerank;

import java.util.Scanner;

public class SuperReducedString {

	private static String super_reduced_string(String s){
        if(s == null){
        	return null;
        }
        return super_reduced_string(s, 0);
    }
    
    static String super_reduced_string(String s, int i){
    	if(s == null){
    		return null;
    	}
        if(i>=s.length()-1){
            return s;
        }
        if(s.charAt(i) == s.charAt(i+1)){
            s = shiftTwoPlacesLeft(s, i);
            s = super_reduced_string(s, i);
        }
        return super_reduced_string(s, i+1);
    }

    private static String shiftTwoPlacesLeft(String s, int i){
        return s.substring(0, i)+ s.substring(i+2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
	
}
