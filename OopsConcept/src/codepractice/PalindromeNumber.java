package codepractice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 12321;
		int original=number;
		int reversed = 0;

		System.out.println("Original number is :"+number);
		while (number > 0) {
			int remainder = number % 10;
			reversed = reversed * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reversed number is :"+reversed);
		
		if (original == reversed) {
			System.out.println("Number is Palindrome...");
		} else {
			System.out.println("Number is not Palindrome...");
		}

	}

}
