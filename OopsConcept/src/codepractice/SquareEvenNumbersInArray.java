package codepractice;

import java.util.Arrays;

public class SquareEvenNumbersInArray {

	public static void main(String[] args) {
		int a[] = {1, 4, 3, 6, 8}; //output: Result[1, 16, 3, 36, 64]
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				a[i]=a[i]*a[i];
				
			}
				
		}

		System.out.println("Result"+Arrays.toString(a));
	}

}
