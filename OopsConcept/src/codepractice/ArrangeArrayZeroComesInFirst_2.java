package codepractice;

import java.util.Arrays;

public class ArrangeArrayZeroComesInFirst_2 {

	public static void main(String[] args) {

		int a[] = { 4, 0, 6, 0, 9, 0, 2, 0, 5 };//[0, 0, 0, 0, 4, 6, 9, 2, 5]
		int n = a.length;
		System.out.println("Original Arry is :" + Arrays.toString(a));
		System.out.println("Lenth of Arry is :" + n);

		int result[] = new int[n];
		int index = 0;

		// Step 1: Put all zeros in front
		for (int num : a) {
			if (num == 0) {
				result[index++] = num;
			}
		}
		// Step 2: Put non-zeros
		for (int num : a) {
			if (num != 0) {
				result[index++] = num;
			}
		}

		System.out.println("After arranging the array(for each loop) :" + Arrays.toString(result));

		// By using enhanced for loop
		int temp[] = new int[n];
		int notZero = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				temp[notZero] = a[i];
				notZero++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				temp[notZero]=a[i];
				notZero++;
			}
		}
		System.out.println("After arranging the array(By using enhanced for loop) :" + Arrays.toString(temp));
	}

}
