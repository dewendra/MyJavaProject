package codepractice;

import java.util.HashMap;

public class CountOccuranceOfCharacterInCharacterArray {

	public static void main(String[] args) {
		char c[]= {'a','e','u','i','a','u'};
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<c.length;i++) {
			char ch=c[i];
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		for(Character k:map.keySet()) {
			System.out.println(k+" : "+map.get(k));
		}

	}

}
