package practice;

public class FindHeighestNumer {

	public static void main(String[] args) {
		System.out.println("Welcome to Java code practice.");
		int[] numbers = { 10, 35, 31, 14, 51, 26, 36, 17, 28, 69, 19 };
		int heighest = Integer.MIN_VALUE;
		int secondHeighest = Integer.MIN_VALUE;
		if (numbers.length < 2) {
			System.out.println("Array should have at least two elements.");
			return;
		}

		for (int num : numbers) {
			if (num > heighest) {
				secondHeighest = heighest;
				heighest = num;
			} else if (num > secondHeighest && num != heighest) {
				secondHeighest = num;
			}
		}
		if (secondHeighest == Integer.MIN_VALUE) {
			System.out.println("There is no distinct second highest number.");
		} else {
			System.out.println("The second highest number is: " + secondHeighest);
		}

	}

}
