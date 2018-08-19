/**
 * 
 */
package com.cci.as.pkg;

/**
 * @author Harsha Govada
 *
 *         Implementation to determine if two given strings are zero or one edit 
 *         away from each other.
 */
public class OneAway {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "pale";
		String str2 = "spela";

		System.out.println("Zero or One edits Made: "+editsCount(str1, str2));
	}

	private static boolean editsCount(String first, String second) {
		boolean change = false;
		if(first.length() == second.length()) {
			//Checking for strings on same length and have zero/one edits
			for(int i=0;i<first.length();i++) {
				if(first.charAt(i)!=second.charAt(i)) {
					if(change) return false;
					change = true;
				}
			}
			return true;
		}
		else if((first.length() + 1 == second.length())||(first.length() - 1 == second.length())) {
			//Checking for strings that differ in length over one additional character
			//We are initally checking for a character that iterates the longer string with smaller one.
			//This gives a pass while the positions match and increments the longer string character iterator(i.e j below) alone
			//the next time it encounters a character that doesnt match its peer indexth element it returns false.
			String str1 = first.length()<second.length()?first:second;
			String str2 = first.length()<second.length()?second:first;
			int i=0,j=0;
			while(i<first.length() && j<second.length()) {
				if(str1.charAt(i)!=str2.charAt(j)) {
					if(i!=j)
						return false;
					j++;
				}
				else {
					i++;
					j++;
				}
			}
			return true;
		}
		return false;
	}

}
