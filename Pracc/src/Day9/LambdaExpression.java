package Day9;

@FunctionalInterface
interface itr{
	int add(int x, int y);
}

interface itr1{
	void greet();
}

interface intf1 {
	boolean iseven(int x);
}




public class LambdaExpression {
	public static void main(String[] args) {
		itr a = (x,y) -> x+y;
	
		System.out.println(a.add(20,30));
		
		
		itr1 b = () -> System.out.println("Hello worldd");
		b.greet();
		
		
	intf1 c =	(int num) ->{
			if(num%2==0) {
				return true;
			}
			else
				return false;
		};
		
		 System.out.println(c.iseven(66));
		
		}//main() ends


		
	}
	
	
	


