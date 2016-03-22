// Name: Tyler Gauntlett
// NID: ty340586
// Date: March 22 2016
// Assignment: Factory Pattern

// Description: Enter a string "Airplane", "Boat" or "Car" in console.
// Output will be the number of wheels and engines required. Demonstrates
// the use of Factory Pattern encapsulation.

import java.util.Scanner;

public class InventoryTesting {

	public static void main(String[] args) {

		VehicleFactory vehicFactory = new VehicleFactory();

		Vehicles type = null;

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter Airplane, Boat or Car to find the number of wheels/engines.");

		if (userInput.hasNextLine()) {
			String vehicleType = userInput.nextLine();

			// Make the vehicle based on user input.
			type = vehicFactory.makeVehicle(vehicleType);

			if (type != null) {

				doStuffVehicle(type);
			}
			else
				System.out.println("Please enter Airplane, Boat or Car.");

		}
		
		userInput.close();

	}

	// Encapsulate the method used to call the Vehicle class. 
	public static void doStuffVehicle(Vehicles aVehicle) {

		aVehicle.displayVehicleInfo();
	}
	
}
