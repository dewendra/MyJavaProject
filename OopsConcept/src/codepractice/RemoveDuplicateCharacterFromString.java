package codepractice;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		String str = "welcome";//output: welcom
		String result = "";

		// Outer loop — pick each character
		for (int i = 0; i < str.length(); i++) {
			char currentCharacter = str.charAt(i);
			boolean isDuplicate = false;
			
			// Inner loop — check if currentChar is already in result
			for (int j = 0; j < result.length(); j++) {
				char resultCharracter = result.charAt(j);
				if (resultCharracter == currentCharacter) {
					isDuplicate = true;
					break;
				}
			}
			 // If not duplicate, add to result
			if (!isDuplicate) {
				result += currentCharacter;
			}
		}
		System.out.println("Original String: " + str);
		System.out.println("After Removing Duplicates: " + result);

	}

}
