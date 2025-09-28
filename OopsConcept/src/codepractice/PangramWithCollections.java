package codepractice;

import java.util.HashSet;

public class PangramWithCollections {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		System.out.println("Input String : " + s);
		boolean result = checkPangram(s);
		if (result) {
			System.out.println("String is Pangram....");
		} else {
			System.out.println("String is not Pangram....");
		}

	}

	private static boolean checkPangram(String s) {
		char c[] = s.toLowerCase().toCharArray();
		HashSet<Character> characterSet = new HashSet<Character>();
		for (char ch : c) {
			if (Character.isLetter(ch)) {
				characterSet.add(ch);
			}
		}
		if (characterSet.size() == 26) {
			return true;
		}
		return false;
	}

}
