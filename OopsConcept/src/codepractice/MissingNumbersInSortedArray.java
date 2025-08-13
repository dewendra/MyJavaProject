package codepractice;

import java.util.Arrays;

public class MissingNumbersInSortedArray {

	public static void main(String[] args) {
		int arr[]= {7, 1, 3, 10, 6, 2}; // Unsorted array with missing numbers
		
		Arrays.sort(arr);
		
		System.out.println("Missing number is : ");
		
		for(int i=0; i<arr.length-1;i++) {
			int currentElement=arr[i];
			int nextElement=arr[i+1];
			
			if(nextElement-currentElement>1) {
				for(int j=currentElement+1;j<nextElement;j++) {
					System.out.print(j+" ");
				}
			}
		}
		
		
		

	}

}
