package practice;

import java.util.Scanner;

public class SearchElementIndices {

	public static void main(String[] args) {
		int[] a = { 1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element for search :");
		int searchElement = sc.nextInt();
		boolean found = false;
		System.out.print("element found at index : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == searchElement) {
				System.out.print(i + " ");
				found = true;
			}
		}
		if (!found) {
			System.out.println("Element not found");
		} else {
			System.out.println();
		}

	}
}
