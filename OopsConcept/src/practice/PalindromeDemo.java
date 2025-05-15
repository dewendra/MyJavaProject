package practice;

/*
 program for test the number is palindrome or not
 program for test the string is palindrome or not
 */
public class PalindromeDemo {

	public static void main(String[] args) {

		// program for test the number is palindrome or not
		/*
		int number = 12321;
		int originalNumber=number;
		int palindromNumber = 0;

		while (number != 0) {
			int remainder = number % 10;
			palindromNumber = palindromNumber * 10 + remainder;
			number = number / 10;

		}
		System.out.println("Palindrom Number is " + palindromNumber);
		if (originalNumber == palindromNumber) {
			System.out.println("Number is palindrom");
		} else {
			System.out.println("Number is not palindrom");
		}
		*/
		
		// program for test the string is palindrome or not
		
		String s="level";
		String originalString=s;
		String reversedString="";
		
		for(int i=s.length()-1;i>=0;i--) {
			reversedString=reversedString+s.charAt(i);
		}
		System.out.println("Reversed String : " +reversedString);
		if (originalString.equals(reversedString) ) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not palindrom");
		}	


	}

}
