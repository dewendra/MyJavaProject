package codepractice;

public class ReverseAnInteger {

	public static void main(String[] args) {
		int number = 12345;
		int reverseNumber = 0;
		int remainder;
		
		System.out.println("Original Number : " + number);
		
		while (number != 0) {
			remainder = number % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			number = number / 10;

		}
		
		System.out.println("Reverse Number : " + reverseNumber);
	}

}
