package exception_handling;

public class ThrowMain {
	private static int divide(int x, int y) {
		if(y == 0) {
			RuntimeException rx = new RuntimeException("2nd value should not be zero");
			throw rx;
		}
		return x / y;
	}

	public static void main(String[] args) {
		try {
			System.out.println(divide(10,0));
		}
		catch(RuntimeException ex) {
			String msg = ex.getMessage();
			System.out.println(msg);
		}
	}
}
