package codepractice;

public class EvenIndexCharacters {

	public static void main(String[] args) {
		String s = "automation";
		StringBuilder result = new StringBuilder();
		StringBuilder result1 = new StringBuilder();

		for (int i = 0; i < s.length(); i = i + 2) {
			char ch = s.charAt(i);
			result = result.append(ch).append(" ");
		}
		System.out.println("EvenIndexCharacters : " + result);
		
		

		System.out.println("-----------EvenIndexCharacters--------------------");
		for (int i = 1; i < s.length(); i = i + 2) {
			char ch = s.charAt(i);
			result1 = result1.append(ch).append(" ");
		}
		System.out.println("OddIndexCharacters : " + result1);
		
		
		
	}

}
