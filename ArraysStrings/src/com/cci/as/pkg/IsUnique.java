package com.cci.as.pkg;

/**
 * @author Harsha Govada
 * 
 * Implementation to determine if a string has all unique characters.
 */
public class IsUnique {

	public static void main(String[] args) {
		String s1 = "VENKAT SRI"; // String with all unique characters
		String s2 = "HARSHA GOVADA"; // Regular String

		System.out.println("Statement '" + s1 + "' has all unique characters: " + isUniqueChars(s1));
		System.out.println("Statement '" + s2 + "' has all unique characters: " + isUniqueChars(s2));
	}

	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) // ASCII string limit verification
			return false;

		/*
		 * We are creating a max size boolean array to set true to each index of
		 * loaction where a character is encountered, if loop inside will be triggered
		 * if any of the previously set character is visited and returns false proving
		 * out sought
		 */
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}

}
