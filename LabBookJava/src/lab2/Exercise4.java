package lab2;

//Create a method which accepts an integer array and removes all the duplicates in the array. 
//Return the resulting array in descending order

import java.util.*;

public class Exercise4 {

	static int[] modifyArray(int[] arr) {
		int n = arr.length;
		int[] arr_new = new int[n];
		int i, j = 0;
		// Array in sorted using Arrays.sort() method
		Arrays.sort(arr);
		// sorted array is iterated and put in new array in order
		for (i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr_new[j++] = arr[i];
			}

		}
		arr_new[j++] = arr[n - 1];
		int[] res_arr = new int[j];
		for (i = 0; i < j; i++) {
			res_arr[i] = arr_new[j - i - 1];
		}
		return res_arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();

		System.out.println("Enter the Numbers: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int ele = sc.nextInt();
			arr[i] = ele;
		}
		System.out.println("Array after sorting  ");
		int[] sort_arr = modifyArray(arr);
		for (int i = 0; i < sort_arr.length; i++) {
			System.out.print(sort_arr[i] + " ");
		}

	}

}