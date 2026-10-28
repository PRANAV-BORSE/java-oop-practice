public class carMain {

	public static void main(String[] args) {
		Car simpleCar;//This car does not have music system
		simpleCar = new Car();
		//Printing description of simple car
		System.out.println(simpleCar.getDescription());
		//Printing power of an engine available in simple car
		
		//1. Using Explicit Reference
		Engine simpleEngine = simpleCar.getCurrentEngine();
		String simplePower = simpleEngine.getPower();
		System.out.println(simplePower);
		//2. Using Object Graph Navigation
		String simplePower2 = simpleCar.getCurrentEngine().getPower();
		System.out.println(simplePower2);
		System.out.println("==========================================");
		Car premiumCar;//This car has music system
		Engine premiumEngine = new Engine("2600 CC", "Diesel");
		MusicSystem premiumMusicSystem = new MusicSystem("Sony", "Poly Tone");
		premiumCar = new Car("Toyota Innova", 2800232, premiumEngine, premiumMusicSystem);
		//Printing description of premium car
		System.out.println(premiumCar.getDescription());
		//Printing fuel of an engine available in premium car
		System.out.println(premiumCar.getCurrentEngine().getFuel());
		//Printing sound effect of a music system available in premium car
		//System.out.println(premiumCar.getCurrentMusicSystem().getSoundEffect()); Not Recommended
		MusicSystem ms = premiumCar.getCurrentMusicSystem();
		if(ms != null) {
			String soundEffect = ms.getSoundEffect();
			System.out.println(soundEffect);
		}
		else
			System.out.println("This car does not have music system.");
		
		

	}

}