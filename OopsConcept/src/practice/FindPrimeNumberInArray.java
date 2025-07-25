package practice;

public class FindPrimeNumberInArray {

	public static void main(String[] args) {
		
		int numbers[] = { 2, 3, 4, 5, 6, 7, 8, 11, 12, 13, 15, 17, 18, 19 };
		 System.out.println("Prime numbers:");
		for (int num : numbers) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
			num++;
		}
	}
	// Method to check if a number is prime
	private static boolean isPrime(int num) {
		if (num < 1) {
			return false;

		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
