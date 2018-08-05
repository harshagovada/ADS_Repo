/**
 * 
 */
package com.cci.as.pkg;

/**
 * @author Harsha Govada 
 * 
 * Implementation to replace all spaces in a given string with '%20' (representing a query parameter in URLs)
 */
public class URLifyString {

	public static void main(String[] args) {
		String str = "Mr John Doe  arrives   "; // two spaces between Doe and Arrives
		char[] s = str.toCharArray();
		int length = s.length; // this is actual count of final string excluding end space. Manual input, This
							// will change with string

		System.out.println("Param String: " + replaceSpaces(s, length));
	}

	private static String replaceSpaces(char[] s, int length) {
		int spaceCount = 0, finalLength, i;

		String url="";
		for (i = 0; i < length; i++) {
			if (s[i] == ' ')
				spaceCount++;
		}

		finalLength = length + spaceCount * 2; /* total length value passed which includes the spaces between words + 2
												extra slots for two among{%,2,0} as spaces already can be used for
												one of {%,2,0} */
		char[] str = new char[finalLength];
		
		//str[finalLength-1] = '\0';
		for (i = length - 1; i >= 0; i--) {
			if (s[i] == ' ') {
				str[finalLength - 3] = '%';
				str[finalLength - 2] = '2';
				str[finalLength - 1] = '0';
				finalLength = finalLength - 3;
			} else {
				str[finalLength - 1] = s[i];
				finalLength = finalLength - 1;
			}
		}
		
		for(i=0;i<str.length;i++)
			url = url+str[i];
		return url;
	}
}
