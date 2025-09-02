package codepractice;

public class ReverseWordNotCharacter {

	public static void main(String[] args) {
		String s = "Dewendra Kumar Singh"; // Singh Kumar Dewendra
		String str[] = s.split("\\s+");
		String result = "";

		for (int i = str.length - 1; i >= 0; i--) {
			String word = str[i];
			result = result + word + " ";
		}
		System.out.print("Output : " + result.toString().trim());

	}

}
