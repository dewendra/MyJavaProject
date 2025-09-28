package codepractice;

import java.util.Arrays;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		
		int arr[] = { 10, 30, 20, 40, 50, 30, 10 };
		
		boolean visited[] = new boolean[arr.length];
		
		System.out.println("Original Array : "+Arrays.toString(arr));
		System.out.print("Duplicate elements : ");
		for (int i = 0; i < arr.length; i++) {
			if (visited[i])
				continue;
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count>1) {
				
				System.out.print(arr[i]+" ");
			}
		}

	}

}
