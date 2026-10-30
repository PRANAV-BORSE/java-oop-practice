package multiThreading;

public class GreetingThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new GreetingThread("Hi ram", 2000);
		Thread t2 = new GreetingThread("Bye sham", 500);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thank you ! Visit Again...");
	}

}
