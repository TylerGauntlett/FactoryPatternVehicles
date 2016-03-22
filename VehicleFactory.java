
public class VehicleFactory {

	public Vehicles makeVehicle(String newVehiclesType)
	{

		// Create objects of varying types based on user input.
		if(newVehiclesType.equals("Airplane"))
		{
			return new Airplane();
		}
		else if(newVehiclesType.equals("Boat"))
		{
			return new Boat();
		}
		else if(newVehiclesType.equals("Car"))
		{
			return new Car();
		}
		else
			return null;
	}
	
	
	
}
