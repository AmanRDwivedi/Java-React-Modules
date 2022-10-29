package lab1;

//Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number

import java.util.*;

public class Excercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numer");
		int number = sc.nextInt();

		int counter = 0; //for counter
		int sum = 0;     //to store sum of cube

		int num = number;
		while (number > 0) {
			int n = number % 10;
			System.out.println("Cube of " + n + " is " + (n * n * n));  //
			sum = sum + (n * n * n);
			counter = counter + 1;
			number = number / 10;

		}
		System.out.println("The Sum of cube of a number " + num + " is " + sum);
		sc.close();

	}
}
