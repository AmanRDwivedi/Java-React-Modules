package lab5;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {

		System.out.println("Enter salary");
		Scanner sc = new Scanner(System.in);

		int salary = sc.nextInt();
		try {
			if (salary < 3000) {
				throw new EmployeeException("Salary is less than 3000");
			}
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
	}
}
