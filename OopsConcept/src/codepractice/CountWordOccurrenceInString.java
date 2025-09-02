package codepractice;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashPrintJobAttributeSet;

public class CountWordOccurrenceInString {

	public static void main(String[] args) {
		String str = "Java is a programming language and java is opensource language ";
		String string[] = str.split("\s");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < string.length; i++) {
			String word = string[i];
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			}else {
				map.put(word, 1);
			}
		}
		for(String k:map.keySet()) {
			if(map.get(k)>1) {
				System.out.println("First word : "+k);
				break;
			}
		}
	}

}
