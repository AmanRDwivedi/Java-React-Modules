package lab1;
//Create a method to check if a number is an increasing number

import java.util.*;

public class Excercisel7 {
	//condition to check if the next number is is in order with second no.
	public static void checkNumber(int nn) { 
		int prevnum = nn % 10, rem;
		int n = nn;
		n = n / 10;
		while (n > 0) {
			rem = n % 10;
			if (rem < prevnum) {
				n = n / 10;
				prevnum = rem;
			} else {
				break;
			}
		}
		//assign boolean value to condition to check
		boolean b = (n == 0);                

		if (b) {
			System.out.println(b);
			System.out.println(nn + " Number is Increasing Number");
		} else {
			System.out.println(b);
			System.out.println(nn + " is not an Increasing Number");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();
		//calling the function with given no.
		checkNumber(n);
		sc.close();

	}
}