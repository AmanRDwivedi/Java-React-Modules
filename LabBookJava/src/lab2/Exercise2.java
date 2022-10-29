package lab2;

/*Create a method that can accept an array of String objects and sort in alphabetical order. 
 * The elements in the left half should be completely in uppercase 
 * and the elements in the right half should be completely in lower case. 
 * Return the resulting array.
 * 
 */

import java.util.*;

public class Exercise2 {
	public static String[] acceptSort(TreeSet<String> arr) {

		int n = arr.size();
		String[] str_arr = new String[n];
		str_arr = arr.toArray(str_arr);

		if (n % 2 == 0) {
			for (int i = 0; i < (n / 2); i++)
				str_arr[i] = str_arr[i].toUpperCase();
			for (int i = (n / 2); i < n; i++)
				str_arr[i] = str_arr[i].toLowerCase();
		} else {
			for (int i = 0; i < (n / 2) + 1; i++)
				str_arr[i] = str_arr[i].toUpperCase();
			for (int i = (n / 2 + 1); i < n; i++)
				str_arr[i] = str_arr[i].toLowerCase();
		}
		return str_arr;
	}

	public static void main(String[] args) {
		//Adding values to treeset
		TreeSet<String> str = new TreeSet<>();
		str.add("program ");
		str.add("to ");
		str.add("return");
		str.add("strings");
		str.add("in");
		str.add("sorted");
		str.add("order");

		String arr_result[] = acceptSort(str);

		System.out.println("Array of String after sort");
		for (String i : arr_result)
			System.out.print(i + "  ");

	}

}