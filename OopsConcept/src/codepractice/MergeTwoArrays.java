package codepractice;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7, 9 };
		int arr2[] = { 2, 4, 6, 8, 10 };// Output :1,2,3,4,5,6,7,8,9,10

		int result[] = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			result[arr1.length + j] = arr2[j];
		}

		System.out.println("final array : " + Arrays.toString(result));
		Arrays.sort(result);
		System.out.println("final sorted array : " + Arrays.toString(result));
	}

}
