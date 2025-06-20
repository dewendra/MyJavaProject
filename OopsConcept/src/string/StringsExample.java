package string;

public class StringsExample {

	public static void main(String[] args) {

		//1) 1st approach to declare the string
		String s1 = "Welcome";
		String s2 = "to Java";
		String s3 = "Automation";
		
		//2) 2nd approach to declare the string
		String a1=new String("Welcome");
		
		//3) 3rd approach to declare the string
		String b1=new String();
		b1="Welcome";
		System.out.println("Example of Sting:" +s1);
		System.out.println("Example of Sting:" +s2);
		System.out.println("Example of Sting:" +s3);
		System.out.println("Example of Sting:" +a1);
		System.out.println("Example of Sting:" +b1);

	}

}
