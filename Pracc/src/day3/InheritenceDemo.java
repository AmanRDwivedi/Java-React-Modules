package day3;
import java.time.LocalDate;


public class InheritenceDemo {

	public static void main(String args[]) {
		Person person =new Person();
		

		person.setfName("Aman");
		System.out.println(person.getfName());
		
		Student s1= new Student();
		Student s2 = new Student(101,"Aman","Dwivedi",LocalDate.of(2000, 07, 9));
		
		System.out.println(s2);
		
		
		Employee e1=new Employee(101,40000,"Aman","Dwivedi",LocalDate.of(2000, 9, 07));
		System.out.println(e1);
		
		
		Address add1 = new Address("Sec1","Nerul", "Mumbai");
		Employee e2=new Employee(101,40000,"Aman","Dwivedi",LocalDate.of(2000, 9, 07),add1);
		System.out.println(e2);
	}
}
