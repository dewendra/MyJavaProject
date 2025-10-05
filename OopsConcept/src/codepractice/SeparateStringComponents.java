package codepractice;

public class SeparateStringComponents {

	public static void main(String[] args) {
		//Input : dewendra123.singh@yahoo.com
		//Character : dewendrasinghyahoocom
		//Digit : 123
		//Special Character : .@.
		
		String s="dewendra123.singh@yahoo.com";
		
		System.out.println("Input : "+s);
		
		StringBuilder character=new StringBuilder();
		StringBuilder digit=new StringBuilder();
		StringBuilder specialCharacter=new StringBuilder();
		
		for(int i=0; i<s.length();i++) {
			Character ch=s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				character.append(ch);
			}else if (Character.isDigit(ch)) {
				digit.append(ch);
			}else {
				specialCharacter.append(ch);
			}
		}
		System.out.println("Character : "+character);
		System.out.println("Digit : "+digit);
		System.out.println("Special Character : "+specialCharacter);
	}

}
