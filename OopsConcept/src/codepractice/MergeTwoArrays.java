package codepractice;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7, 9 };
		int arr2[] = { 2, 4, 6, 8, 10 };

		int n1 = arr1.length;
		int n2 = arr2.length;

		int mergedaArr[] = new int[n1 + n2];

		int i = 0, j = 0, k = 0;

		// Merge both arrays
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j]) {
				mergedaArr[k++] = arr1[i++];
			} else {
				mergedaArr[k++] = arr2[j++];
			}
		}
		// Copy remaining elements of arr1
		while (i < n1) {
			mergedaArr[k++] = arr1[i++];
		}
		// Copy remaining elements of arr2
		while (j < n2) {
			mergedaArr[k++] = arr2[j++];
		}

		// Print result
		for (int l = 0; l < mergedaArr.length; l++) {
			System.out.print(mergedaArr[l]);
			if (l < mergedaArr.length - 1) {
				System.out.print(",");
			}
		}

		// By using Arrays.sort method

		int a1[] = { 1, 3, 5, 7, 9 };
		int a2[] = { 2, 4, 6, 8, 10 };
		
		int merged[]=new int[a1.length+a2.length];
		
		// Copy both arrays into merged
		System.arraycopy(a1, 0, merged, 0, a1.length);
		System.arraycopy(a2, 0, merged,  a1.length,  a2.length);
		  
		// Sort merged array
		Arrays.sort(merged);

		// Print result
        System.out.println(Arrays.toString(merged));
		
	}
}
