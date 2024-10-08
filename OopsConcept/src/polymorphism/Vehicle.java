package polymorphism;

import java.util.Scanner;

//Example of Method Overriding in Java
class Vehicle {
	void vehicleColor() {
		System.out.println("Vehicle color is silver.");
	}

	void vehicleGear() {
		System.out.println("Vehicle has 4 gear.");
	}

	void vehicleWheels() {
		System.out.println("Vehicle has 4 wheels.");
	}

	void vehicleSpeed() {
		System.out.println("Vehicle maximum speed is 150km/h.");
	}
}

class Car extends Vehicle {
	void vehicleSpeed() {
		System.out.println("Car maximum speed is 240km/h.");
	}
}

class Truck extends Vehicle {
	void vehicleWheels() {
		System.out.println("Truck has 8 wheels.");
	}

	void vehicleSpeed() {
		System.out.println("Truck maximum speed is 80km/h.");
	}
}

class Bike extends Vehicle {
	void vehicleWheels() {
		System.out.println("Bike has 2 wheels.");
	}

	void vehicleSpeed() {
		System.out.println("Bike maximum speed is 120km/h.");
	}
}

class MainTest {

	public static void main(String[] args) {
		String vehicleType;
		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println("Enter Vehicle Type");

			vehicleType = userInput.nextLine(); // Read user input
			System.out.println("Vehicle type is: " + vehicleType); // Output user input
		}
		Vehicle vehicle = null;

		switch (vehicleType) {
		case "car":
			vehicle = new Car();

			break;
		case "truck":
			vehicle = new Truck();

			break;
		case "bike":
			vehicle = new Bike();

			break;

		default:
			System.out.println("Enterd Vehicle is not available.");
			break;
		}
		vehicle.vehicleColor();
		vehicle.vehicleWheels();
		vehicle.vehicleGear();
		vehicle.vehicleSpeed();
		

	}
}