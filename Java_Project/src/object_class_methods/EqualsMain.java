package object_class_methods;

public class EqualsMain {
	
	public static void main(String[] args) {
//		int data = 100;
//		int anotherData = 100;
//		System.out.println(data == anotherData);
		
		Planet biggestPlanet = new Planet("Jupiter", 16);
		Planet largestPlanet = new Planet("Jupiter", 16);
//		System.out.println(biggestPlanet == largestPlanet);
		System.out.println(biggestPlanet.equals(largestPlanet));
	}
}
