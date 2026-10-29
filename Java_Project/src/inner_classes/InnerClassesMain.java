package inner_classes;

public class InnerClassesMain {

	public static void main(String[] args) {
		Outer.StaticInner si = new Outer.StaticInner();
		si.print();
		
		System.out.println("===============================");
		
		Outer ou = new Outer();
		Outer.Nested ns = ou.new Nested();
		//Outer.Nested ns = new Outer().new Nested();
		ns.display();
		
		System.out.println("===============================");
		
		ou.showGreeting();
	}

}
