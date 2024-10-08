package polymorphism;
//Example of Method Overloading in Java
class Shapes {
	public void area() {
		System.out.println("Area of");
	}
	public void area(int radius) {
		System.out.println("Circle="+3.4*radius*radius);
	}
	public void area(int length, int bredth) {
		System.out.println("Rectangle="+length*bredth);
	}
	public void area(double bredth, double height) {
		System.out.println("Triangle="+0.5*bredth*height);
	}

}
class Main{
	public static void main(String[] args) {
		Shapes shapes=new Shapes();
		shapes.area();
		shapes.area(2);
		shapes.area(2, 3);
		shapes.area(2.3, 3.4);
	}
}