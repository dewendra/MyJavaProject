package codepractice;

public class StringManipulation {

	public static void main(String[] args) {
		String s = "12abc34xyz56lmn10";
		int n = s.length();
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				sb.append(ch);
			} else {
				if (sb.length() > 0) {
					sum = sum + Integer.parseInt(sb.toString());
					sb.setLength(0);
				}
			}
		}
		if (sb.length() > 0) {
			sum = sum + Integer.parseInt(sb.toString());

		}
		System.out.println("Sum : " + sum);
	}
}
