package codepractice;

public class CountCharacterOccurrenceInString {

	public static void main(String[] args) {

		String s = "programming";
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count = 0;
			boolean alreadyCounted = false;
			for (int j = 0; j < i; j++) {

				if (s.charAt(j) == ch) {
					alreadyCounted = true;
					break;
				}
			}
			if (alreadyCounted) {
				continue;
			}
			for (int k = 0; k < s.length(); k++) {
				if (s.charAt(k) == ch) {
					count++;
				}
			}
			if (count >= 1) {

				System.out.println(ch + " : " + count);
			}
		}
	}

}
