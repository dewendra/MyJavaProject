package codepractice;

public class CountVowelsConsonantsInString {

	public static void main(String[] args) {
		String s = "dewendra singh";
		s = s.toLowerCase();
		int totalCharacter = 0;
		int totalVowel = 0;
		int totalConsonent = 0;
		// System.out.println("Input String ; " + s);

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch)) {
				totalCharacter++;
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					totalVowel++;
				} else {
					totalConsonent++;
				}
			}
		}
		System.out.println("Total Charachter :" + totalCharacter);
		System.out.println("Total Vowel :" + totalVowel);
		System.out.println("Total Consonent :" + totalConsonent);

	}
}
