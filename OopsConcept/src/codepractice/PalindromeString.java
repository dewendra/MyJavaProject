package codepractice;

public class PalindromeString {

	public static void main(String[] args) {
		String s="java is language";
		String temp="";
		for(int i=s.length()-1;i>=0;i--) {
			temp+=s.charAt(i);
		}
		if(s.equals(temp)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
