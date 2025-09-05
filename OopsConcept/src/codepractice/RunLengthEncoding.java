package codepractice;

import java.util.HashMap;
import java.util.Map;

public class RunLengthEncoding {

	public static void main(String[] args) {
		String s = "aaabbbbccccc"; // output:a3b4c5
		StringBuilder result = new StringBuilder();
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				result.append(s.charAt(i)).append(count);
				count = 1;
			}
		}
		result.append(s.charAt(s.length() - 1)).append(count);
		System.out.println(result);

		System.out.println("----------By using Map Collections-------------");
		// by using Map Collections

		String s1 = "aaabbbbccccc"; // output:a3b4c5
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int j = 0; j < s1.length() - 1; j++) {
			char c = s.charAt(j);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println("Map is : "+map);
		for(Character k:map.keySet()) {
			System.out.print(k+""+map.get(k));
		}
	}

}
