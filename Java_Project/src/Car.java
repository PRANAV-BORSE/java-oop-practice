public class Car {
	private String description;
	private int onRoadPrice;
	private Engine currentEngine;
	private MusicSystem currentMusicSystem;
	public Car() {
		// By default, this car does not have music system
		description = "Hyundai I10";
		onRoadPrice = 875000;
		currentEngine = new Engine();
		//Not initializing currentMusicSystem as this car does not have music system.
	}
	public Car(String description, int onRoadPrice, Engine currentEngine, MusicSystem currentMusicSystem) {
		this.description = description;
		this.onRoadPrice = onRoadPrice;
		this.currentEngine = currentEngine;
		this.currentMusicSystem = currentMusicSystem;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getOnRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice(int onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	public Engine getCurrentEngine() {
		return currentEngine;
	}
	public void setCurrentEngine(Engine currentEngine) {
		this.currentEngine = currentEngine;
	}
	public MusicSystem getCurrentMusicSystem() {
		return currentMusicSystem;
	}
	public void setCurrentMusicSystem(MusicSystem currentMusicSystem) {
		this.currentMusicSystem = currentMusicSystem;
	}

}