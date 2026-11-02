package multiThreading;

public class MessageThreadMain {

	public static void main(String[] args) {
		Message msg = new Message("Happy Diwali","****************");
		Thread t1 = new MessageThread(msg);    //same object msg for both
		Thread t2 = new MessageThread(msg);   //blocked state
		
		t1.start();    //ready state
		t2.start();
		

	}

}
