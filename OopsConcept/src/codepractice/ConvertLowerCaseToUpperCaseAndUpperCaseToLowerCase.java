package codepractice;

public class ConvertLowerCaseToUpperCaseAndUpperCaseToLowerCase {

	public static void main(String[] args) {
		String s="Hello World";//hELLO wORLD
		char str[]=s.toCharArray();
		StringBuilder result=new StringBuilder();
		System.out.println("Original String : "+s);
		
		for(char ch:str) {
			if(Character.isUpperCase(ch)) {
				result.append(Character.toLowerCase(ch));
			}else if (Character.isLowerCase(ch)) {
				result.append(Character.toUpperCase(ch));
			}else {
				result.append(ch);
			}
		}

		System.out.println("After conversion of String : "+result);
	}

}
