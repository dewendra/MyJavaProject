package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		 try {
	            int a = 10 / 0;  // this will throw ArithmeticException
	        } catch (Exception e) {
	            System.out.println("Msg a");
			} /*
				 * catch (ArithmeticException e) { System.out.println("Msg b"); }
				 */

	}

}
