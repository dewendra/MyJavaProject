package codepractice;

import java.util.Scanner;

public class PrimeNumbersBetween {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number : ");
		int startNumber = sc.nextInt();
		System.out.println("Enter last number : ");
		int lastNumber = sc.nextInt();

		for (int num = startNumber; num <= lastNumber; num++) {
			if (num > 1) {
				boolean isPrime = true;
				for (int i = 2; i < Math.sqrt(num); i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.print(num + " ");
				}
			} else {
				System.out.println("Start and End Number is 1");
			}

		}
	}
}
