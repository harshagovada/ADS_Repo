/**
 * 
 */
package com.cci.as.pkg;

/**
 * @author Harsha Govada
 *
 * 	Implementation to compress a string that is with only upper case and lower case alphabets
 *  It is supposed to return the input string in-case the compressed string length is equal to actual string
 *  Sample cases: INPUT : aabbcc -> Compression: a2b2c2 ; OUTPUT: aabbcc;
 *  			  INPUT : aaabbbc -> Compression: a3b3c ; OUTPUT: a3b3c  
 */
public class StringCompression {
	public static void main(String[] args) {
		String inputStr = "a";
		StringCompression s = new StringCompression(); // tried to do it with out declaring the method static like in previous solutions
		System.out.println("Best Compressed Version: "+s.Solution(inputStr));
	}
	private String Solution(String inputStr) {
		
		int count=1;
		String compressedString = "";
		for(int i=0;i<inputStr.length();i++) {
			if(i==0) {
				compressedString = ""+inputStr.charAt(i); // initializing the compressed string
			}			
			else if(inputStr.charAt(i) == inputStr.charAt(i-1)) //incrementing count at each matchof it previous character
				count++;
			else if(inputStr.charAt(i) != inputStr.charAt(i-1)) { //appending the final count on new character, followed by the new character
				compressedString = compressedString+count+inputStr.charAt(i);
				count=1;
			}
		}		
		compressedString = compressedString+count; //appending the count of final character
		return compressedString.length()<inputStr.length()?compressedString:inputStr; //returning the best compressed version of the string 
	}

}
