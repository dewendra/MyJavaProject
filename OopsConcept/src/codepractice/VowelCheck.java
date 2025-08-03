package codepractice;

public class VowelCheck {

	public static void main(String[] args) {
		String s = "welcome";
		boolean vowel = false;
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel = true;
				break;
			}
		}
		if (vowel) {
			System.out.println("Vowel found");
		} else {
			System.out.println("Vowel not found");
		}
	}

}
