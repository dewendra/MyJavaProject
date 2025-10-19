package codepractice;

import java.util.Scanner;

public class SearchElementInArray {

	 public static void main(String[] args) {
	        int[] arr = {1, 3, 3, 4, 5, 6, 6, 7, 8, 9};
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the element to search: ");
	        int searchElement = scanner.nextInt();

	        boolean found = false;

	        System.out.print("Element found at index: ");
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == searchElement) {
	                System.out.print(i + " ");
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("Element not found");
	        }

	        scanner.close();
	    }

}
