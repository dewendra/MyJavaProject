package codepractice;

public class FirstRepeatingCharacterThroughForLoop {

	public static void main(String[] args) {
		String str="welcome";
		char result='\0';
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			boolean isDuplicate=false;
			int count=1;
			for(int j=0;j<str.length();j++) {
				if(i!=j && ch==str.charAt(j)) {
					isDuplicate=true;
					count++;
					break;
				}
			}
			if(count>1) {
				result=ch;
				System.out.println("First repeating Character : " + result);
				break;
			}
		}

	}

}
