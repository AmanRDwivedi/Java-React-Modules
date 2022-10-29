package Lab3;

//Create a method which accepts a String and 
//replaces all the consonants in the String with the next alphabet.

import java.util.*;

public class Exercise3 {

	static boolean isVowel(char ch) {
		//function returns true any of character compared is vowel
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
			return false;
		} else
			return true;
	}

	static String alterString(String str) {
		str = str.toLowerCase();
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (!isVowel(arr[i])) {
				if (arr[i] == 'z') {
					arr[i] = 'b';
				} else {
					arr[i] = (char) (arr[i] + 1);
					if (isVowel(arr[i])) {
						arr[i] = (char) (arr[i] + 1);
					}
				}

			}
		}
		return String.valueOf(arr);
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println("String after");
		System.out.println(alterString(str));

	}

}