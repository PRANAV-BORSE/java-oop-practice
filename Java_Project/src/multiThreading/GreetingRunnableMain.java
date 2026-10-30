package multiThreading;

public class GreetingRunnableMain {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		String name = mainThread.getName();
		int priority = mainThread.getPriority();
		System.out.println("Name :"+ name + ",priority :" + priority);
		
		Runnable r1 = new GreetingRunnable("HELLO", 2000);
		Runnable r2 = new GreetingRunnable("NICE", 500);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	
	}
}
