package lab6;

import java.util.*;

public class Exercise6 {

	public static List<Integer> votersList(Map<Integer, Integer> mp) {
		//new array list to add the linkedhashmap content to list 
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());
		List<Integer> lst = new ArrayList<>();
		for (Map.Entry<Integer, Integer> i : list) {
			if (i.getValue() > 18) {
				lst.add(i.getKey());
			}
		}
		return lst;
	}

	public static void main(String[] args) {
		
		Map<Integer, Integer> mp = new LinkedHashMap<>();
		mp.put(10043, 16);
		mp.put(10032, 18);
		mp.put(10083, 22);
		mp.put(10092, 33);
		mp.put(10028, 35);
		mp.put(1109, 17);

		/*
		 * 
		 * public static void main(String[] args) { Map<String,Integer> mp=new
		 * LinkedHashMap<>(); mp.put("Aman",16); mp.put("Ram",18); mp.put("Jafar",22);
		 * mp.put("Shree",33); mp.put("Jay",35); mp.put("Hari",17);
		 * 
		 */

		System.out.println("People  eligible to vote ");

		System.out.println(votersList(mp));
	}

}