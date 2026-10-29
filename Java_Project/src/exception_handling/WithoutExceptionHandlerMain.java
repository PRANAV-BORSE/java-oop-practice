package exception_handling;

public class WithoutExceptionHandlerMain {

	public static void main(String[] args) {  //args = command line arguments
		//Programs to accept two numbers as command line arguments and prints their sum
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int result = x + y;
		
		System.out.println(result);
	}
}
