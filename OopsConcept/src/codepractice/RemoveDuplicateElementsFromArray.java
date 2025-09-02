package codepractice;

import java.util.Arrays;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 4, 6, 7, 8, 9, 10 };//output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		int duplicatesCount = 0;
		int n = arr.length;

		// Temporary array to store unique elements
		int temp[] = new int[n];
		int newLength = 0;
		// Outer loop — pick each element
		for (int i = 0; i < n; i++) {
			boolean isduplicates = false;
			
			// Inner loop — check if element is already in temp array
			for (int j = 0; j < newLength; j++) {

				if (arr[i] == temp[j]) {
					isduplicates = true;
					break;
				}
			}
			// If not duplicate, add to temp array
			if (!isduplicates) {
				temp[newLength] = arr[i];
				newLength++;
			}
		}
		int uniqueArray[] = Arrays.copyOf(temp, newLength);
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Array without Duplicates: " + Arrays.toString(uniqueArray));

	}

}
