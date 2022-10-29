package lab6;

import java.util.*;

public class Exercise2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Strings to count character array:");
		String str = sc.nextLine();
		countChars(str);
	}

	private static void countChars(String str) {
		Map<Character, Integer> numCharMap = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ' ')
				continue;
			if (numCharMap.containsKey(c)) {
				numCharMap.put(c, numCharMap.get(c) + 1);
			} else {
				numCharMap.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> m : numCharMap.entrySet()) {
			System.out.println("Char- " + m.getKey() + " Count " + m.getValue());
		}
	}
}