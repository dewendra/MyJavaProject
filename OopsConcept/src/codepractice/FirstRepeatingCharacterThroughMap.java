package codepractice;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingCharacterThroughMap {

	public static void main(String[] args) {
		String str = "programming";
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
			if (map.get(k) > 1) {
				System.out.println("First reapting character is :" + k);
				break;
			}
		}

	}

}
