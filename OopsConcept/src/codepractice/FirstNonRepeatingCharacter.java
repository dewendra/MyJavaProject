package codepractice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "welcome";
		str = str.toLowerCase();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (Character k : map.keySet()) {
			if (map.get(k) == 1) {
				System.out.println("First non repeating character is :" + k);
				break;
			}
		}

	}

}
