package exception_handling;

public class ThrowsMain {
	private static void doTest() throws Exception {
		
	}
	private static void conductTest() {
		//Invoked this method
		try {
			doTest();
		}
		catch(Exception ex) {
			
		}
	}
	private static void performTest() throws Exception{
		doTest();
	}
	
	private static void handleTest() throws RuntimeException {
		
	}
	public static void main(String[] args){
		//Invoked conductTest() and performTest()
		conductTest();
		//performTest();
		try {
			performTest();
		}
		catch(Exception ex) {
			
		}
		handleTest();

	}
}
