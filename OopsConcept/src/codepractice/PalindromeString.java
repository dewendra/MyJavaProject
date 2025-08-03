package codepractice;

public class PalindromeString {

	public static void main(String[] args) {
		String s1="java is language";
		String temp="";
		for(int i=s1.length()-1;i>=0;i--) {
			temp+=s1.charAt(i);
		}
		if(s1.equals(temp)) {
			System.out.println("String "+s1+" is palindrome");
		} else {
			System.out.println("String "+s1+" is not palindrome");
		}
	}

}
