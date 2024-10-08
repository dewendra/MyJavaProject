package abstraction;

//Abstract class
abstract class Animal {

	// Abstract method (does not have a body)
	public abstract void animalSound();

	// Regular method
	public void sleep() {
		System.out.println("Zzz");
	}

}

//Subclass (inherit from Abstraction)
class Dog extends Animal {

	@Override
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("Te Dog is Barking like Bho BHo");

	}

}

class Main {
	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		myDog.animalSound();
		myDog.sleep();
	}
}