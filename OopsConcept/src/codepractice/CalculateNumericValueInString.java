package codepractice;

public class CalculateNumericValueInString {

	public static void main(String[] args) {
		String s = "12Singh345 test 23";
		int sum = 0;
		System.out.println("Original String : " + s);
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		System.out.println("Sum of Numeric Value In String : " + sum);

	}

}
