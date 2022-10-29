package lab6;


	import java.util.*;

	public class Exercise4 {

		
		public static void main(String[] args) {
			HashMap<Integer,Integer> mp=new HashMap<>();
			mp.put(1002,90);
			mp.put(1009,70);
			mp.put(1076,80);
			mp.put(1005,65);
			mp.put(1096,85);
			mp.put(1134,75);
			mp.put(1089,95);
			mp.put(1013,53);
			System.out.println(getStudents(mp));
		}
		
		
		public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer>mp) {
			List<Map.Entry<Integer,Integer>> list=new ArrayList<>(mp.entrySet());
			HashMap<Integer,String> new_map=new HashMap<>();
			
			for(Map.Entry<Integer,Integer> i:list) {
				
				if(i.getValue() >=90) {
					new_map.put(i.getKey(),"Gold");
				}
				else if(i.getValue() >=80 && i.getValue() <90) {
					new_map.put(i.getKey(),"Silver");
				}
				else if(i.getValue() >=70 && i.getValue() <80) {
					new_map.put(i.getKey(),"Bronze");
				}
				else {
					new_map.put(i.getKey(),"Not Elible");
				}
				
			}
			
			return new_map;
		}
		
		
	
	}