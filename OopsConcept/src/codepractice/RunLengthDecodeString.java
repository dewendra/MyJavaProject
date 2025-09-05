package codepractice;

public class RunLengthDecodeString {

	public static void main(String[] args) {
		String s = "a2b3c4d5";// output aabbbccccddddd
		System.out.println("Input String : "+s);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch)) {
				int count=Character.getNumericValue(s.charAt(i+1));
				for(int j=0;j<count;j++) {
					
				result.append(ch);
				}
			}
		}
		System.out.println("Output String : "+result);

	}

}
