package codepractice;

public class FindLengthOfLastWord {

	public static void main(String[] args) {
		String s = "          Hello Java world Selenium             Automation                  ";
		String words[] = s.split(" ");
		String lastWord = words[words.length - 1];
		
		System.out.println("Last word is "+lastWord+" and length is : "+lastWord.length());

	}

}
