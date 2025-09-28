package exceptions;

import java.text.NumberFormat;

public class ExceptionHandling {

	// Types of Java Exceptions
	// Checked Exception

	// Unchecked Exception

	// Error

	public static void main(String[] args) {
		int n;
		int array[] = { 1, 2, 3 };
		try {
			n = 10 / 0;
			
			System.out.println(n);
			System.out.println("Print 3 no of array" + array[3]);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Finaly block executed....");
		}
		// A scenario where NullPointerException occurs
		// String s=null;
		// System.out.println("String length"+s.length());

		// A scenario where NumberFormatException occurs
		// String str = "abc";
		// int i = Integer.parseInt(str);
		// System.out.println(+i);
		// A scenario where ArrayIndexOutOfBoundsException occurs

		// int array[]= {1,2,3};
		// System.out.println("Print 3 no of array" +array[3]);
		// System.out.println("Test");

	}
}
