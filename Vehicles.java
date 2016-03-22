
public class Vehicles {

	private String type;
	private int wheels;
	private int engines;
	
	// Super class containing the output command that will display vehicle information.
	public void displayVehicleInfo()
	{
		System.out.println(getType() + " require " + getWheels() + " wheels and " + getEngines() + " engines.");
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getEngines() {
		return engines;
	}

	public void setEngines(int engins) {
		this.engines = engins;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
