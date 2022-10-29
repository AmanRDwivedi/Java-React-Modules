package lab1;

import java.util.*;

public class Excercise {

	//
	public static int calculateDifference(int n) {
		int temp = 0, temp2 = 0;
		for (int i = 1; i <= n; i++) {
			temp = temp + i * i;
		}
		for (int i = 1; i <= n; i++) {
			temp2 = temp2 + i;
		}

		return (temp - (temp2 * temp2));   //
		// return ((temp2*temp2)- temp);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		int diff = calculateDifference(n);
		System.out.println("Difference of " + n + " natural numbers are " + diff);

		sc.close();
	}
}