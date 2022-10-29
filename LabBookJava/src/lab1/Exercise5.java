package lab1;

//Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.

import java.util.*;

public class Exercise5 {
	
	public static int calculateSum(int n) {
		int temp = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
				temp = temp + i;
			}
		}

		return temp;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		sc.nextLine();

		int sum = calculateSum(n);
		System.out.println("Sum of " + n + " natural numbers are " + sum);
		sc.close();
	}
}