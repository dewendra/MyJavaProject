package codepractice;

import java.util.Arrays;

public class TwoArraysEqualCheck {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 4, 5, 2, 1 };
		boolean flag = true;

		
		if (a.length != b.length) {
			System.out.println("Both array are not equal....");
			return;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("First Array : "+Arrays.toString(a));
		System.out.println("Second Array : "+Arrays.toString(b));
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				flag=false;
			}
		}

		if(flag==true) {
			System.out.println("Both Arrays are equal...");
		}else {
			System.out.println("Both Arrays are not equal...");
		}
	}

}
