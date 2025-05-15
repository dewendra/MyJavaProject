package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FiterOutDupicateIntergers {

	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 3, 3, 3, 4, 6, 7, 7, 8 };

		ArrayList<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			Integer j = a[i];
			System.out.println(+j);
			if (map.containsKey(j)) {
				map.put(j, map.get(j) + 1);
			} else {
				map.put(j, 1);
			}
		}

		for (Integer k : map.keySet()) {
			if (map.get(k) > 1) {
				list.add(k);
			}
		}
		System.out.println("Duplicate integer is : " + list);

	}

}
