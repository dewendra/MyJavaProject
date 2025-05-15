package practice;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Dewendra Singh";// reverse this string as output- weivretni tcs a si sihT
		String s1="This is a tcs interview";

		String temproryString = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			temproryString += s1.charAt(i);
		}
		System.out.println(temproryString);

	}

}
