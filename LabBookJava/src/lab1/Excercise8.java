package lab1;
//Create a method to check if a number is a power of two or not

import java.util.*;

public class Excercise8 {
	public static boolean checkNumber(int n) {
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to check");
		int n = sc.nextInt();
		sc.nextLine();
		boolean result = checkNumber(n);
		if (result == true)
			System.out.println("Input " + n + " is power of 2");
		else
			System.out.println("Input " + n + " is not power of 2");

		sc.close();
	}
}