/**
 * 
 */
package com.ctci.as.pkg;

/**
 * @author Harsha Govada
 * 
 *         Implementation to check if any of a given string's permutation will
 *         be a palindrome (**This might not be optimal solution)
 */
public class PalindromePermutation {

	public static void main(String[] args) {
		String str = "aloha hola";
		char[] s = str.replace(" ", "").toLowerCase().toCharArray();

		System.out.println("'" + str + "'" + " is " + hasPalindrome(s, s.length));

	}

	private static String hasPalindrome(char[] s, int length) {
		int count = 0;
		int[] table = new int[127];  //max possible ascii character length allocated
		for(int i=0;i<length;i++) {
			int x = Character.getNumericValue(s[i]); //to increment corresponding array location for each character
			if(x!=-1) {
				table[x]++; //incrementing the value at corresponding character ascii location
				if(table[x]%2==1)	count++; // increment counter at every odd occurance
				else	count--; //decrement on the second iteration of the same character
			}
		}
		
		return (count<=1)?"a palindrome":"not a palindrome"; // final count can be 0 for even char palindrome and 1 for odd char palindrome
	}

}
