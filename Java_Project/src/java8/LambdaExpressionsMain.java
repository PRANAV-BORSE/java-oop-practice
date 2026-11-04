package java8;
@FunctionalInterface
interface Greet {
	void doGreet();
}


interface Greeting {
	void sayGreeting(String user);
}



public class LambdaExpressionsMain{
	public static void main(String[] args) {
		Greet gr = () -> System.out.println("Happy Diwali");
		gr.doGreet();
		
		System.out.println("============================");
		
		Greeting grn = (String nm) -> System.out.println("Happy Diwali to " + nm);
		grn.sayGreeting("Prince");
	}
}
