/**
 * 
 */
package com.cci.as.pkg;

/**
 * @author Harsha Govada
 *
 *	Implementation to check if the given two strings s1 and s2 are a rotation of one an another
 *
 */
public class StringRotation {
	public static void main(String[] args) {
		String s1 = "keyboard";
		String s2 = "boardkey";
		
		System.out.println("Strings are a rotation of one another: "+isRotation(s1,s2));
	}


	private static boolean isRotation(String s1, String s2) {
		if(s1.length() == s2.length() && s1.length() != 0) { //checking if the lengths match and strings are not null.
			String s = s1+s1; //appending the string1 to itself in order to check is the string2 is a substring of it.
			if(s.contains(s2)) return true;
		}
		return false;
	}

}
