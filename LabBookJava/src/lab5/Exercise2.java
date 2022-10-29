package lab5;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

		String fname = "zahir";
		String sname = null;
		Scanner sc = new Scanner(System.in);

		// System.out.println("Enter first name : ");
		// String fname=sc.nextLine();

		// System.out.println("Enter Surname name : ");
		// String sname=sc.nextLine();

		try {
			if (fname == null || sname == null) {
				throw new NameException("First Name or Last Name should not be null");
			}
		} catch (NameException e) {
			e.printStackTrace();
		}

	}

}
