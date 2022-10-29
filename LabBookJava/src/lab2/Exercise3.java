package lab2;

//Create a method which accepts an integer array,

//reverse the numbers in the array and returns the resulting array in sorted order

import java.util.*;

public class Exercise3 {

	// TreeSet<Integer>
	public static Integer[] getSorted(TreeSet<Integer> int_arr) {
		int size = int_arr.size();
		Integer arr[] = new Integer[size];
		arr = int_arr.toArray(arr);

		for (int i = 0; i < size; i++) {
			String val = String.valueOf(arr[i]);
			String rev_val = new StringBuilder(val).reverse().toString();
			arr[i] = Integer.parseInt(rev_val);
		}

		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {

		TreeSet<Integer> int_arr = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();

		System.out.print("Insert Elements ");
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			int_arr.add(number);
		}

		Integer result_arr[] = getSorted(int_arr);

		System.out.println("Array after Revrsing the number and Soretd are as follows: ");
		for (int i : result_arr)
			System.out.print(i + "  ");
		sc.close();

	}

}
