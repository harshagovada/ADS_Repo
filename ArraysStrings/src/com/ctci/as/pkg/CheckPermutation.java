package com.ctci.as.pkg;

import java.util.Arrays;

/**
 * @author Harsha Govada
 *
 * Implementation to check if one string is the permutation of the other. (toUpper/toLower strings not implemented depends on the question)
 */
public class CheckPermutation {

	public static void main(String[] args) {
		String str1 = "TEST";
		String str2 = "TSET";
		
		System.out.println("Strings "+str1+" & "+str2+" are identical: "+permutation(str1,str2));
	}

	private static boolean permutation(String str1, String str2) {
		if(str1.length()!=str2.length()) //checking lengths
			return false;
		
		char[] s1 = str1.toCharArray(); //creating a character array and sorting the array
		char[] s2 = str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		String st1 = new String(s1); //converting the arrays back to strings
		String st2 = new String(s2);
		
		return st1.equals(st2); // returns the permutation result
	}

}
