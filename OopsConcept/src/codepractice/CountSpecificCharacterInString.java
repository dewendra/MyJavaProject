package codepractice;

public class CountSpecificCharacterInString {

	public static void main(String[] args) {
		
		String s = "Example";// count occurrence of e in string output:2
		System.out.println("Input string is : " + s);
		//s = s.toLowerCase();
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'e' || ch == 'E') {
				count++;
			}
		}
		System.out.println("Occurance of e is : " + count);
	}

}
