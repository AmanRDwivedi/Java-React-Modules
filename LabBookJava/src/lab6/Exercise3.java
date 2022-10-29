package lab6;

import java.util.*;

public class Exercise3 {

	public static Map getSquares(int[] arr) {
		Map<Integer,Integer> mp=new LinkedHashMap<>();
		for(int i:arr) {
			mp.put(i,i*i);                         //no. and their square
		}
		return mp;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enterthe size and no of elements");
		int n=sc.nextInt();
		int[] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The  no with Squares ");
		System.out.println(getSquares(arr));
	}
}