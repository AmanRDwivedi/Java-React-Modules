package Lab3;

/*
 * Create a method that accepts a String and checks if it is a positive string.
 *  A string is considered a positive string,
 *   if on moving from left to right each character in the String comes 
 *   after the previous characters in the Alphabetical order.
 */

import java.util.*;

public class Exercise8 {
	private static boolean positiveString(String str) {
		int len = str.length();
		char[] ch = new char[len];

		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
		}
		// Check the array with sorted order
		Arrays.sort(ch);
		for (int i = 0; i < len; i++) {
			if (ch[i] != str.charAt(i)) {
				return false;
			}
		}
		// returns trueif array is in sorted order
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = sc.nextLine();

		boolean result = positiveString(str);
		if (result)
			System.out.println(result + " : " + str + " is positive");
		else
			System.out.println(result + " : " + str + " is not positive");
	}
}