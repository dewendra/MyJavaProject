package exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		 // 1. ArithmeticException
        try {
            int n = 10 / 0;
            System.out.println(n);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }finally {
            System.out.println("Finally block executed (Arithmetic check done).");
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int array[] = {1, 2, 3};
            System.out.println("Fourth element: " + array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // 3. NullPointerException
        try {
            String s = null;
            System.out.println("Length: " + s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }finally {
            System.out.println("Finally block executed (Null check done).");
        }

        // 4. NumberFormatException
        try {
            String str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }finally {
            System.out.println("Finally block executed .");
        }
     // Example 6: No exception occurs
        try {
            int num = 50 / 5;
            System.out.println("Result: " + num);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (No exception case).");
        }

        System.out.println("Program continues after handling exceptions...");
    }

	

}
