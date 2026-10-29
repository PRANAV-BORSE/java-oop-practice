package object_class_methods;

public class ToStringMain {

	public static void main(String[] args) {
		// int data = 100;
		//System.out.println(data);
		Planet myPlanet = new Planet();
		//System.out.println(myPlanet.getName());
		//System.out.println(myPlanet.getMoons());
		System.out.println(myPlanet);  //implicit call
		System.out.println(myPlanet.toString());  //Explicit call

	}

}
