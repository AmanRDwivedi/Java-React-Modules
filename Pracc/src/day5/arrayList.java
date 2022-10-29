package day5;

import java.util.*;
public class arrayList {
public static void main(String[] args) {
	
	ArrayList<Integer> al =new ArrayList<Integer>();
	
	
	for(int i =0; i<5; i++) {
		al.add(i);
	}
		
	System.out.println(al);
	for(int i =0;i<al.size();i++) {
		System.out.print(al.get(i) +" ");
	}
	
	al.remove(2);
	System.out.println(al);
	
	for(int i =0;i<al.size();i++) {
		System.out.print(al.get(i) +" ");
	}
}
}
