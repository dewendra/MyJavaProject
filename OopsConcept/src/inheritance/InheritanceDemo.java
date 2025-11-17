package inheritance;


class A{
	public void a(){
		System.out.println("I am in Class A");
	}
}
class B extends A{
	public void b(){
		System.out.println("I am in Class B");
	}
}
class C extends B{
	public void c(){
		System.out.println("I am in Class C");
	}
}

public class InheritanceDemo {
	
	public static void main(String[] args) {
		C c=new C();
		c.a();
		c.b();
		c.c();
		
	}

}
