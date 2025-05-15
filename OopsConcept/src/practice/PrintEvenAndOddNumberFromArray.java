package practice;

import java.util.ArrayList;

public class PrintEvenAndOddNumberFromArray {

	public static void main(String[] args) {
		System.out.println("Welcome to Java code practice.");
		int numbers[] = { 10, 15, 20, 25, 30 };
		int evencount = 0;
		int oddcount = 0;

		System.out.println("Orginal number is : "+ java.util.Arrays.toString(numbers));
		for (int number : numbers) {
			if (number % 2 == 0) {
				evencount++;
			} else
				oddcount++;
		}
		System.out.println("total even number is :" + evencount);
		System.out.println("total even number is :" + oddcount);

		// Create a new array for storing even and odd numbers
		ArrayList<Integer> evenNumber = new ArrayList<Integer>();
		ArrayList<Integer> oddNumber = new ArrayList<Integer>();

		for (int number : numbers) {
			if (number % 2 == 0) {

				evenNumber.add(number);
			} else {
				oddNumber.add(number);

			}
		}
		System.out.println("Even number is " + evenNumber);
		System.out.println("Odd number is " + oddNumber);

	}

}
