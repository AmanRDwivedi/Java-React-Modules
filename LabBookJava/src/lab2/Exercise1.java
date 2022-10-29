package lab2;
//Create a method which accepts an array of integer elements 

//and return the second smallest element in the array

import java.util.*;

public class Exercise1 {
	public static int getSecondSmallest(int arr[]) {
		//sort() to sort the ayyay in asc order
		Arrays.sort(arr);

		int second;
		//assigning second index value of array to variable second
		second = arr[1];
		return second;
	}

	public static void main(String[] args) {

		int[] arr = { 25, 2, 10, 12, 30, 6, 36 };
		int secondSmallestElement = getSecondSmallest(arr);

		if (secondSmallestElement != 0)
			System.out.println("Second Smallest Element is:= " + secondSmallestElement);
		else
			System.out.println("Invalid Inputs");
	}

}