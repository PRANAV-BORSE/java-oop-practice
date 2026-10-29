package exception_handling;

public class WithExceptionHandlerMain {

	public static void main(String[] args) {  //args = command line arguments
		//Programs to accept two numbers as command line arguments and prints their sum
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int result = x + y;
			System.out.println(result);
		}
		
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Enter at least 2 numbers !");
		}
	}
}
