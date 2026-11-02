package multiThreading;

public class Message {
	private String content;
	private String decoration;
	
	public Message(String content, String decoration) {
		this.content = content;
		this.decoration = decoration;
	}
	
	public void print() throws InterruptedException {   //only change here added synchronized keyword
		System.out.println(decoration);
		Thread.sleep(1000);
		System.out.println(content);
		Thread.sleep(1000);
		System.out.println(decoration);
		Thread.sleep(1000);
	}
	
	
}
