package lab1;

/*
Exercise 3: The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?

	 */

import java.util.*;

public class Exercise3 {
	// sequence by recursive function 
	private static int recursiveFib(int n1) {
		if (n1 == 1)
			return 1;
		else if (n1 == 2)
			return 1;
		else
			return recursiveFib(n1 - 1) + recursiveFib(n1 - 2);
	}
	// sequence by non recursive function 
	private static int fibonacci(int n1) {
		if (n1 == 1)
			return 1;
		if (n1 == 2)
			return 1;

		int num1 = 1;
		int num2 = 2;
		int arr[] = new int[n1];
		arr[0] = num1;
		arr[1] = num2;

		int i = 2, temp = 0;
		while (i < n1) {
			temp = num1 + num2;
			arr[i] = temp;
			num1 = num2;
			num2 = temp;
			i++;
		}

		return arr[n1 - 2];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n1 = sc.nextInt();
		System.out.println("The " + n1 + " value " + "by Non Recursive Method = " + fibonacci(n1));
		System.out.println("The " + n1 + " value " + " by Recursive Method = " + recursiveFib(n1));
		sc.close();

	}

}
