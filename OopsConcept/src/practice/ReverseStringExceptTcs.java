package practice;

public class ReverseStringExceptTcs {

	public static void main(String[] args) {
		String sentence = "This is a tcs interview";
		String[] words = sentence.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for (int i = words.length - 1; i >= 0; i--) {
			String word = words[i];
			if (word.equalsIgnoreCase("tcs")) {
				result.append(word);
			} else {
				result.append(new StringBuilder(word).reverse());

			}
			if (i != 0) {
				result.append(" ");
			}
		}
		System.out.println(result.toString());
	}

}
