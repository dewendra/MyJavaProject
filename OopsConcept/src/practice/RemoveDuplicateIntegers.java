package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateIntegers {

	/*
	 * public static void main(String[] args) { int[] a = { 1, 2, 2, 3, 3, 3, 4, 6,
	 * 7, 7, 8 };
	 * 
	 * Set<Integer> uniqueSet =new HashSet<Integer>(); for(int num:a) {
	 * uniqueSet.add(num);
	 * 
	 * } System.out.println("Unique Element is : "+uniqueSet); }
	 */

	/*
	 * public static void main(String[] args) { int[] a = { 1, 2, 2, 3, 3, 3, 4, 6,
	 * 7, 7, 8 };
	 * 
	 * Set<Integer> uniqueSet =new LinkedHashSet<Integer>(); for(int num:a) {
	 * uniqueSet.add(num);
	 * 
	 * } System.out.println("Unique Element is : "+uniqueSet); }
	 */

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 3, 3, 4, 6, 7, 7, 8 };
		ArrayList<Integer> uniqueList = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : a) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
				uniqueList.add(num);// Add to list only if not seen before
			}

		}
		System.out.println("Unique Element is : " + uniqueList);
	}
}
