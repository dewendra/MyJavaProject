package codepractice;

import java.util.Arrays;

public class ArrangeArrayZeroComesInFirst_2 {

	public static void main(String[] args) {

		int arr[] = { 4, 0, 6, 0, 9, 0, 2, 0, 5 };//[0, 0, 0, 0, 4, 6, 9, 2, 5]
		int n = arr.length;
		System.out.println("Original Arry is :" + Arrays.toString(arr));
		System.out.println("Lenth of Arry is :" + n);

		int result[] = new int[n];
		int index = 0;

		// Step 1: Put all zeros in front
		for (int num : arr) {
			if (num == 0) {
				result[index++] = num;
			}
		}
		// Step 2: Put non-zeros
		for (int num : arr) {
			if (num != 0) {
				result[index++] = num;
			}
		}

		System.out.println("After arranging the array(for each loop) :" + Arrays.toString(result));

		// By using enhanced for loop
		int temp[] = new int[n];
		int notZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				temp[notZero] = arr[i];
				notZero++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp[notZero]=arr[i];
				notZero++;
			}
		}
		System.out.println("After arranging the array(By using enhanced for loop) :" + Arrays.toString(temp));
	}

}
