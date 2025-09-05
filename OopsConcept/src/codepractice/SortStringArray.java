package codepractice;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		String s[] = { "sonia", "dev", "manish" };
		String temp;
		
		// First method
		Arrays.sort(s);
		System.out.println("Sorted String : " + Arrays.toString(s));

		// Second method

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].compareTo(s[j]) > 0) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println("Sorted String.. : " + Arrays.toString(s));
	}

}
