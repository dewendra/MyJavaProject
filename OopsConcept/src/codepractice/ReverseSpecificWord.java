package codepractice;

public class ReverseSpecificWord {

	public static void main(String[] args) {
		String s = "dewendra kumar singh"; // output : dewendra ramuk singh

		String words[] = s.split("\\s+");
		String result = "";

		for (String word : words) {

			if (!word.equalsIgnoreCase("kumar")) {
				result = result + word;

			} else {
				for (int i = word.length() - 1; i >= 0; i--) {
					result = result + word.charAt(i);
				}
			}
			result = result +" ";
		}
		System.out.println(result);
	}

}
