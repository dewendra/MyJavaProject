package codepractice;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArray {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 8, 1, 3 };
		Integer arrays[]={ 5, 2, 8, 1, 3 };
		System.out.println("Original Array : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Ascending Sorted Array : " + Arrays.toString(arr));

		//for descending order
		Arrays.sort(arrays, Collections.reverseOrder());
		System.out.println("Descending Sorted Array : " + Arrays.toString(arrays));
		
	}

}
