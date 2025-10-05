package abstraction;

public class AbstractDemo {
	// Abstract class
	abstract class Vehicle {
	    // Fields
	    String brand;
	    int year;

	    // Constructor
	    public Vehicle(String brand, int year) {
	        this.brand = brand;
	        this.year = year;
	    }

	    // Abstract methods
	    abstract void start();
	    abstract void stop();

	    // Regular method
	    void displayInfo() {
	        System.out.println("Brand: " + brand + ", Year: " + year);
	    }
	}

	// Subclass Car
	class Car extends Vehicle {

	    int wheels;

	    public Car(String brand, int year, int wheels) {
	        super(brand, year); // Call parent constructor
	        this.wheels = wheels;
	    }

	    // Implement abstract methods
	    @Override
	    void start() {
	        System.out.println("Car is starting with key.");
	    }

	    @Override
	    void stop() {
	        System.out.println("Car is stopping with brake.");
	    }

	    // Additional method
	    void carDetails() {
	        displayInfo();
	        System.out.println("Wheels: " + wheels);
	    }
	}

	// Subclass Bike
	class Bike extends Vehicle {

	    boolean hasCarrier;

	    public Bike(String brand, int year, boolean hasCarrier) {
	        super(brand, year);
	        this.hasCarrier = hasCarrier;
	    }

	    @Override
	    void start() {
	        System.out.println("Bike is starting with kick start.");
	    }

	    @Override
	    void stop() {
	        System.out.println("Bike is stopping using disc brake.");
	    }

	    void bikeDetails() {
	        displayInfo();
	        System.out.println("Has Carrier: " + hasCarrier);
	    }
	}

	public static void main(String[] args) {
//		Vehicle car = new Car("Toyota", 2022, 4);
//        car.start();      // Car is starting with key.
//        car.stop();       // Car is stopping with brake.
//        car.displayInfo(); // Brand: Toyota, Year: 2022

//        Vehicle bike = new Bike("Honda", 2021, true);
//        bike.start();      // Bike is starting with kick start.
//        bike.stop();       // Bike is stopping using disc brake.
//        bike.displayInfo(); // Brand: Honda, Year: 2021
	}

}
