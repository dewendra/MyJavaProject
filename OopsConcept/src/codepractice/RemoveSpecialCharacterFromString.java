package codepractice;

public class RemoveSpecialCharacterFromString {

	public static void main(String[] args) {
		String s="dewendra@2!1#3$4%5^6&7*8";//dewendra21345678
		
		StringBuilder result= new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch) || Character.isDigit(ch)) {
				result.append(ch);
			}
		}
		System.out.println(result);
	}

}
