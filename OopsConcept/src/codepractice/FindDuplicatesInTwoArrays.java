package codepractice;

import java.util.ArrayList;

public class FindDuplicatesInTwoArrays {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 3 };
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					list.add(a[i]);
					// System.out.print(a[i]+" ");
				}
			}
		}
		System.out.println(list);

	}

}
