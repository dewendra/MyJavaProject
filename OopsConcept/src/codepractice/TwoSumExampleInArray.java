package codepractice;

import java.util.Arrays;

public class TwoSumExampleInArray {

	public static void main(String[] args) {

		int a[] = { 6, 8, 11, 6, 7, 18 };
		int target = 17;
		System.out.println("Input Array : " + Arrays.toString(a));
		System.out.println("Target is : " + target);

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
					System.out.println("Index of first element is " + i + " and Index of second element is " + j);
					System.out.println("Element is : "+a[i]+","+a[j]);
					System.out.println("matched");
					return;
				}

			}
		}
		System.out.println("Target is not matching..........");
	}

}
