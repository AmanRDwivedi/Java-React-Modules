package day4;

public class ExceptionHandling {
	
	static Employee e;
	String strns = "Hello world";
	
	public static void main(String[] args) {
		
		try {
		String str = "Hello";
		System.out.println(str.charAt(str.length()));//String index out of range: 5
		System.out.println(str.charAt(str.length()-1));
		
		
		//System.out.println(e.getSalary());//null
		
		e = new Employee(47000.0,101);
		System.out.println(e.getSalary()); //47000
		
		
	 
		  //System.out.println(strns);
		
		 ExceptionHandling exh = new  ExceptionHandling();
		 System.out.println(exh.strns);
		
//Try catch Block throw  throws and custom exception
		 
		
			 
		 }
		/*
		 catch(Exception ex) {   //handles most of the exception
			 ex.printStackTrace();//exception
			 System.out.println(ex.getMessage());//message
			 
		 }
		 */
		//Muliple catch blocks can be added for exception
		 catch(StringIndexOutOfBoundsException ex) {
			 ex.printStackTrace();//exception
			 System.out.println(ex.getMessage());//message
			 
		 }
		finally {
			System.out.println("Finally block");
		}
	
	

		 System.out.println("Outside try block it will dissplay!!");
		 
		 
		 
		 
		
	}

}
