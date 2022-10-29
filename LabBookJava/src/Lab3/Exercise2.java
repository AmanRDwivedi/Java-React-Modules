package Lab3;

import java.util.*;

public class Exercise2 {

	static String getImage(String str) {
		//Using StringBuffer so we can use reverse() to reverse the string available in StringBuffer
		StringBuffer stbf = new StringBuffer(str);
		String rev = stbf.reverse().toString();
		return str + "|" + rev;
	}

	public static void main(String[] args) {
		System.out.println("Evter the string to reverse");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println("The String and String in reverse order");

		System.out.println(getImage(str));
	}

}