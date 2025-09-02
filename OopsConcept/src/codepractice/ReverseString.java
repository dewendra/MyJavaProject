package codepractice;

public class ReverseString {

	public static void main(String[] args) {
		String mainString="Java is invented in 1995 by Sun Microsystems"; //output : smetsysorciM nuS yb 1995 ni detnevni si avaJ
		String reversedString=reverseString(mainString);
		System.out.println("Original String : "+mainString);
		System.out.println("Reversed String : "+reversedString);
		

	}

	private static String reverseString(String mainString) {
		String words[]=mainString.split(" ");
		StringBuilder result=new StringBuilder();
		
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
