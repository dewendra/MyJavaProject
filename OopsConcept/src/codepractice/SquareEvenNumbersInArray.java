package codepractice;

import java.util.Arrays;

public class SquareEvenNumbersInArray {

	public static void main(String[] args) {
		int[] list = {1, 4, 3, 6, 8}; //output: Result[1, 16, 3, 36, 64]
		
		for(int i=0;i<list.length;i++) {
			if(list[i]%2==0) {
				list[i]=list[i]*list[i];
				
			}
				
		}

		System.out.println("Result"+Arrays.toString(list));
	}

}
