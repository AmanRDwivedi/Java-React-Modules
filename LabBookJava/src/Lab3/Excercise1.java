package Lab3;

import java.util.*;

public class Excercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers ");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		int sum = 0, ele;
		while (st.hasMoreTokens()) {

			ele = Integer.parseInt(st.nextToken());
			sum += ele;
			System.out.println(ele);
		}
		System.out.println("Sum is : " + sum);

		sc.close();
	}

}