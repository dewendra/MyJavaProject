package codepractice;

import java.util.Scanner;

public class LinearSearchExample {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elemet for search :");
		int searchElement = sc.nextInt();
		int index = linearSearch(arr, searchElement);
		
		if(index!=-1) {
			System.out.println("Element found at index : "+index);
		}else {
			System.out.println("Element not found");
		}
	}

	private static int linearSearch(int[] arr, int searchElement) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchElement) {
				return i;
			}
		}
		return -1;
	}

}
