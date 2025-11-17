package codepractice;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 9 };
		int b[] = { 2, 4, 6, 8, 10 };// Output :1,2,3,4,5,6,7,8,9,10

		int result[] = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			result[a.length + j] = b[j];
		}

		System.out.println("final array : " + Arrays.toString(result));
		Arrays.sort(result);
		System.out.println("final sorted array : " + Arrays.toString(result));
	}

}
