package java8;
@FunctionalInterface
interface Greet {
	void doGreet();
}


interface Greeting {
	void sayGreeting(String user);
}


interface Operator {
	int doOperator(int x,int y);
}


public class LambdaExpressionsMain{
	public static void main(String[] args) {
		Greet gr = () -> System.out.println("Happy Diwali");
		gr.doGreet();
		
		System.out.println("============================");
		
		Greeting grn = (String nm) -> System.out.println("Happy Diwali to " + nm);
		grn.sayGreeting("Prince");
		Greeting grn2 = name -> System.out.println("Happy Diwali to "+ name);
		grn2.sayGreeting("Neel");
		
		System.out.println("============================");
		
		Operator adder = (n1,n2) -> n1 + n2;
		int addition = adder.doOperator(10, 5);
		System.out.println(addition);
		
		Operator subtractor = (n1,n2) -> {
		int subtraction = n1 - n2;
		return subtraction;
		};
		
		int subtraction = subtractor.doOperator(40, 30);
		System.out.println(subtraction);
		
		System.out.println("============================");
		
		Runnable rn = () -> System.out.println("Thank you !, visit again.");
		Thread t1 = new Thread(rn);
		t1.start();
		
		
		
		
	}
}
