package day6;

public class WrapperClass {

	public static void main(String[] args) {
		int a = 40;
		
		
		Integer w = Integer.valueOf(a);
		
		System.out.println(w.getClass().getName());
		System.out.println();
		
		System.out.println(a);
		
		
		
		
				Integer a2 =50;
				System.out.println(a2.getClass().getName());
				
				
				
				Integer y1 = new Integer(10);
				Integer y2 = new Integer(12);
				
				//intValue()
				int y3 = y1.intValue();
				System.out.println(y1);	System.out.println(y1.getClass().getName());
				
				System.out.println(y3);
				
				
				
			//wrapper class to string
				String str2 = String.valueOf(176);
				System.out.println(str2.getClass().getName());
				
		
	}

}
