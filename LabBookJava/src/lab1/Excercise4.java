package lab1;
//program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?

import java.util.*;
public class Excercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i, count;

		for (i = 2; i <= n; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}