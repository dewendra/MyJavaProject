package codepractice;

public class FrequencyOfRepeatingCharacters {

	public static void main(String[] args) {
		String s = "programing";
		String str = s.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			int count = 0;
			boolean alreadyCounted = false;
			for (int j = 0; j < i; j++) {
				if (str.charAt(j) == ch) {
					alreadyCounted = true;
					break;
				}
			}
			if (alreadyCounted) {
				continue;
			}
			for (int k = 0; k < str.length(); k++) {
				if (str.charAt(k) == ch) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(ch + " : " + count);
			}
		}

	}

}
