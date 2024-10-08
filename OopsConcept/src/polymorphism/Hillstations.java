package polymorphism;

//Example of Method Overriding in Java

class Hillstations {
	void location() {
		System.out.println("Location is:");
	}

	void famousFor() {
		System.out.println("Famous for:");
	}
}

class Manali extends Hillstations {
	void location() {
		System.out.println("Manali is in Himachal Pradesh.");
	}

	void famousFor() {
		System.out.println("It is Famous for Hadimba Temple and adventure sports.");
	}
}

class Massori extends Hillstations {
	void location() {
		System.out.println("Mussoorie is in Uttarakhand.");
	}

	void famousFor() {
		System.out.println("It is Famous for education institutions.");
	}
}

class Gulmarg extends Hillstations {
	void location() {
		System.out.println("Gulmarg is in J&K.");
	}

	void famousFor() {
		System.out.println("It is Famous for skiing.");
	}
}

class MainMethod {
	public static void main(String[] args) {
		Hillstations hillstations = new Hillstations();
		Hillstations manali = new Manali();
		Hillstations massori = new Massori();
		Hillstations gulmarg = new Gulmarg();
		hillstations.location();
		hillstations.famousFor();
		manali.location();
		manali.famousFor();
		massori.location();
		massori.famousFor();
		gulmarg.location();
		gulmarg.famousFor();
	}
}