package codepractice;

import java.util.Arrays;

public class ArrangeArrayZeroComesInLast_2 {

	public static void main(String[] args) {
		int arr[] = { 4, 0, 6, 0, 9, 0, 2, 0, 5 };//[4, 6, 9, 2, 5, 0, 0, 0, 0]
		int arr1[] = { 1, 0, 1, 0, 1, 0 };
		int n = arr.length;
		System.out.println("Original Arry is :" + Arrays.toString(arr));
		System.out.println("Lenth of Arry is :" + n);

		int result[] = new int[n];
		int index = 0;
		for (int num : arr) {
			if (num != 0) {
				result[index++] = num;
			}
		}
		for (int num : arr) {
			if (num == 0) {
				result[index++] = num;
			}
		}
		System.out.println("After arranging :" + Arrays.toString(result));
	}

}
