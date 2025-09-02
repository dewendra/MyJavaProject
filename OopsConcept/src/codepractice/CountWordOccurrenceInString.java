package codepractice;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurrenceInString {

	public static void main(String[] args) {
		String str = "Java is a programming language and Java is opensource language ";
		String string[] = str.split("\\s+");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < string.length; i++) {
			String word = string[i];
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		// For count of word occurrence in a string
		for (String k : map.keySet()) {
			System.out.println(k + " : " + map.get(k));
		}
		// For first repeating of word
		for (String l : map.keySet()) {
			if (map.get(l) > 1) {
				System.out.println("First reapting word is : " + l);
			break;
			}
		}
		// For first non repeating of word
		for (String m : map.keySet()) {
			if (map.get(m) == 1) {
				System.out.println("First non reapting word is : " + m);
			break;
			}
		}
	}

}
