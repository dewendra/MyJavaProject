package codepractice;

public class SubstringGenerator {

	public static void main(String[] args) {
		String s = "ABC";
		System.out.println("All substring of given string : " + s);
		// int size=s.length();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str = s.substring(i, j);
				System.out.println(str);
			}
		}

	}

}
