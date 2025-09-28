package codepractice;

public class PangramStringCheck {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		s=s.toLowerCase();
		System.out.println("String is : "+s);
		boolean result=checkPangram(s);

		if(result) {
			System.out.println("String is pangram..");
		}
		else {
			System.out.println("String is not pangram....");
		}
	}

	private static boolean checkPangram(String s) {
		if(s.length()<0) {
			return false;
		}
		for(char i='a';i<='z';i++) {
			if(s.indexOf(i)<0) {
				return false;
			}
			//System.out.println(i);
		}
		return true;
		
	}

}
