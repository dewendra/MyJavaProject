package codepractice;

public class FirstNonRepeatingCharacterThroughForLoop {

	public static void main(String[] args) {
		String str = "welcome";
		char result = '\0';

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean isUnique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && ch == str.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				result = ch;
				System.out.println("First Non repeating Character : " + result);
				break;
			}
		}

	}

}
