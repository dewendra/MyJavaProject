package codepractice;

public class FindDuplicateInStringArray {

	public static void main(String[] args) {
		String s[] = { "dev", "sonia", "manish", "dev", "sonia", "amit", "alok", "amit" };

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {

				if (s[i].equals(s[j])) {
					System.out.print(s[i] + " ");
				}

			}
		}
	}

}
