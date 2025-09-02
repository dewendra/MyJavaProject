package codepractice;

public class CheckDigitsInString {

	public static void main(String[] args) {
		String s = "12alok34";

		boolean digitAvailable = false;

		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				digitAvailable = true;
				break;
			}
		}
		if (digitAvailable == true) {
			System.out.println("String contains digit..");
		} else {
			System.out.println("String does not contains digit..");

		}
	}

}
