package interfaceExample;

public interface Vehicle {
	void vehicleSpeed();
	void vehicleColor();
	void vehicleGear();
	void vehicleWheels();

}
class Car implements Vehicle{

	@Override
	public void vehicleSpeed() {
		System.out.println("Car maximum speed is 240Km/h.");
		
	}

	@Override
	public void vehicleColor() {
		System.out.println("Car color is red.");
		
	}

	@Override
	public void vehicleGear() {
		System.out.println("Car has 5 gear.");
		
	}

	@Override
	public void vehicleWheels() {
		System.out.println("Car has 4 wheels.");
		
	}
	
}
class Truck implements Vehicle{

	@Override
	public void vehicleSpeed() {
		System.out.println("Truck maximum speed is 80Km/h.");
		
	}

	@Override
	public void vehicleColor() {
		System.out.println("Truck color is yellow.");
		
	}

	@Override
	public void vehicleGear() {
		System.out.println("Truck has 5 gear.");
		
	}
	@Override
	public void vehicleWheels() {
		System.out.println("Truck has 8 wheels.");
		
	}
	
}
class Bike implements Vehicle{

	@Override
	public void vehicleSpeed() {
		System.out.println("Bike maximum speed is 130Km/h.");
		
	}

	@Override
	public void vehicleColor() {
		System.out.println("Bike color is black-red.");
		
	}

	@Override
	public void vehicleGear() {
		System.out.println("Bike has 4 gear.");
		
	}
	@Override
	public void vehicleWheels() {
		System.out.println("Bike has 2 wheels.");
		
	}
	
}
 class Main{
	 String vehicleType;
	public static void main(String[] args) {
		
		Vehicle car=new Car();
		car.vehicleColor();
		car.vehicleWheels();
		car.vehicleGear();
		car.vehicleSpeed();
		Vehicle truck=new Truck();
		truck.vehicleColor();
		truck.vehicleWheels();
		truck.vehicleGear();
		truck.vehicleSpeed();
		Vehicle bike=new Bike();
		bike.vehicleColor();
		bike.vehicleWheels();
		bike.vehicleGear();
		bike.vehicleSpeed();
		
	}
}