package codepractice;

import java.io.OutputStream;
import java.util.Arrays;

public class MergeTwoArraysInAscendingOrder {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 9 };
		int b[] = { 2, 4, 6, 8, 10 };//Output :1,2,3,4,5,6,7,8,9,10

		int n1 = a.length;
		int n2 = b.length;

		int mergedaArr[] = new int[n1 + n2];

		int i = 0, j = 0, k = 0;

		// Merge both arrays
		while (i < n1 && j < n2) {
			if (a[i] < b[j]) {
				mergedaArr[k++] = a[i++];
			} else {
				mergedaArr[k++] = b[j++];
			}
		}
		// Copy remaining elements of arr1
		while (i < n1) {
			mergedaArr[k++] = a[i++];
		}
		// Copy remaining elements of arr2
		while (j < n2) {
			mergedaArr[k++] = b[j++];
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
		int a2[] = { 2, 4, 6, 8, 10 };//Output :[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
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
