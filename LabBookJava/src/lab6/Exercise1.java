package lab6;

import java.util.*;
import java.util.Map.Entry;

public class Exercise1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap();
		hmap.put("AA", 1001);
		hmap.put("BB", 1005);
		hmap.put("CC", 1012);
		hmap.put("DD", 1002);
		hmap.put("EE", 1009);

		Exercise1 l1 = new Exercise1();
		List lst1 = l1.getvalues(hmap);
		System.out.println(lst1);
	}

	public List getvalues(HashMap hsm) {
		List<Integer> lst = new ArrayList<>();
		Set<Entry<String, Integer>> setObj = hsm.entrySet();
		for (Entry<String, Integer> el : setObj) {
			lst.add(el.getValue());
		}
		// method to sort using collection.sort()
		Collections.sort(lst); // method to sort
		return (lst);
	}
}
