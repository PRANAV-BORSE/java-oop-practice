
public class ArrayAsParameterMain {
	
	private static double[] getSquareRoots(int[] allNumbers) {
		int size = allNumbers.length;
		double[] allSquareRoots = new double[size];    //Dynamic array
		int index = 0;
		for(int everyNumber : allNumbers) {
			double squareRoot = Math.sqrt(everyNumber);
			allSquareRoots[index] = squareRoot;
			index++;
		}
		return allSquareRoots;
	}

	public static void main(String[] args) {
		int[] number = {65,6,8,90,91};
		
		//Passing this array to a method and the method finds the square roots
		//of all the numbers and returns them.
		double[] squareRoots = getSquareRoots(number);
		for(double squareRoot : squareRoots) {
			System.out.println(squareRoot);
		}
	}

}
