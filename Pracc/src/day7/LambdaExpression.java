package day7;



@FunctionalInterface
interface Intf1 {
	int add(int x, int y);
}

@FunctionalInterface
interface Intf2 {
	void message();
}

@FunctionalInterface
interface Intf3 {
	boolean isEven(int x);
}

public class LambdaExpression {

	public static void main(String[] args) {
	
		
		Intf2 a = () -> System.out.println("Hello There,  Whats up");
		a.message();
		
		Intf3 b = (num) -> {
			if (num % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(b.isEven(10));  //true

	}
		
		
		

	}


