package lab5;
//Validate the age of a person and display proper message by using user defined exception. 

//Age of a person should be above 15.

import java.util.*;

public class Exercise1 {
	public static void main(String[] args) throws AgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");

		int age = sc.nextInt();
		try {
			if (age < 15) {
				throw new AgeException("Age should not be less than 15");
			}
		} catch (AgeException e) {
			e.printStackTrace();
		}
	}
}
