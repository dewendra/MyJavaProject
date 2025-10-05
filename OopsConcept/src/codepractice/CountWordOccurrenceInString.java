package codepractice;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurrenceInString {

	public static void main(String[] args) {
		String str = "Java is a programming language and Java is opensource language ";
		String words[] = str.split("\\s+");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		// For count of word occurrence in a string
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		// For first repeating of word
		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println("First reapting word is : " + key);
			break;
			}
		}
		// For first non repeating of word
		for (String key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.println("First non reapting word is : " + key);
			break;
			}
		}
	}

}
