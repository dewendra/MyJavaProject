package codepractice;

public class ReverseAppendString {

	public static void main(String[] args) {

		String s = "Welcome word";// output : Welcome word word Welcome 
		String s1[] = s.split("\\s+");
		String result = "";
		String finalString = "";

		for (int i = s1.length - 1; i >= 0; i--) {
			String word = s1[i];
			result = result + word + " ";
		}
		finalString = s + " " + result;
		System.out.println(finalString);
	}

}
