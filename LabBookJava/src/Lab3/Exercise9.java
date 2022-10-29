package Lab3;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in (dd/MM/yyyy) : ");
		String date = sc.nextLine();
		//to format the date in required format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate pdate = LocalDate.parse(date, formatter);
		//to get current/todays date
		LocalDate now = LocalDate.now();
		//to get difference between given and todays date
		Period diff = Period.between(now, pdate);

		System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());
	}
}
