package lab6;

import java.util.*;

public class Exercise7 {

	public static int[] getSorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			StringBuffer sb = new StringBuffer();
			//to reverse the string and assign it to integer in string format
			arr[i] = Integer.parseInt(sb.append(String.valueOf(arr[i])).reverse().toString());
		}
		List<Integer> lst = new ArrayList<>();
		for (int i : arr) {
			lst.add(i);
		}
		Collections.sort(lst);
		for (int i = 0; i < lst.size(); i++) {
			arr[i] = lst.get(i);
		}
		return arr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array in sorted order: ");
		for (int i : getSorted(arr)) {
			System.out.print(i + " ");
		}

	}

}