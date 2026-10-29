package inner_classes;

public class Outer {
	
	//staticInner
	private int x = 10;
	private static int y = 20;
	
	public void showGreeting() {
		class Message {
			String getGreeting() {
				return "Welcome";
			}
		}
		Message msg = new Message();
		System.out.println(msg.getGreeting());
	}
			
	public static class StaticInner {
		public void print() {
			System.out.println(y);
			//System.out.println(x);   //as x is non static
		}
		
	}
	public class Nested {
		public void display() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	
}
