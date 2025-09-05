package codepractice;

public class CharacterOccurrenceAscii {

	public static void main(String[] args) {
		String s = "java@#$%&*@#@#$%&";
		
		int result[]=new int[256];
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			result[ch]++;
		}
		
		for(int i=0;i<result.length;i++) {
			if(result[i]>0) {
			System.out.println((char)i+" : "+result[i]);
			}
		}

	}

}
