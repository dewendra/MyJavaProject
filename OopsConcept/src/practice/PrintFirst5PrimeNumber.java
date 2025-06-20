package practice;

public class PrintFirst5PrimeNumber {

	public static void main(String[] args) {

		int count = 0;
		int num = 1;
		 System.out.println("First 5 prime numbers:");
		while (count < 5) {
			if (isPrime(num)) {
				System.out.print(num + " ");
				count++;
			}
			num++;
		}
	}

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
