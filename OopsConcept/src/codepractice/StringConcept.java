package codepractice;

public class StringConcept {

	// print a string

	public static void main(String[] args) {
		String s = "welcome";
		String s1 = "John";

		System.out.println("String is : " + s);
		System.out.println("Concatinated String is :" + (s + s1));

		s = "chenges";
		System.out.println("After assigning another string in s is :" + s);

		// reverse a string
		String main = "welcome";
		String reverseString = "";
		for (int i = main.length() - 1; i >= 0; i--) {
			reverseString += main.charAt(i);
		}
		System.out.println("Reverse String is:" + reverseString);
		
		//Reverse string only not integer from a sentence
		
		String main1="Java is invented in 1995 by Sun Microsystems";
		String reversedString=reversedString(main1);
		System.out.println("Original String :"+main1);
		System.out.println("After reversed string :"+reversedString);
		
		
	}

	private static String reversedString(String main1) {
		String words[]=main1.split(" ");
		StringBuilder result= new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			if(words[i].matches("\\d+")) {
				result.append(words[i]);
			}else
			{
				result.append(new StringBuilder(words[i]).reverse());
			}
			if(i!=0) {
				result.append(" ");
			}
		}
		
		return result.toString();
	}

	

}
