package codepractice;

public class DoubleCharacters {

	public static void main(String[] args) {
		String s="Hello";//Output: HHeelloo
		System.out.println("Input :" +s);
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='l') {
				result.append(ch);
			}else {
				result.append(ch).append(ch);
			}
		}
		System.out.println("Output :" +result);
		
		
		
		
	}

}
