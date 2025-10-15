package codepractice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterThroughMap {

	public static void main(String[] args) {
		String str = "welcome";
		str = str.toLowerCase();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.get(ch) == 1) {
				System.out.println("First non repeating character is :" + ch);
				return;
			}
		}
		System.out.println("No non repeating character found..");
	}

}
