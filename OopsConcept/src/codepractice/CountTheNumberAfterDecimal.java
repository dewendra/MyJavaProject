package codepractice;

public class CountTheNumberAfterDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=123.4567;
		
		String input=String.valueOf(number);
		
		int indexOfDecimal=input.indexOf(".");
		System.out.println("Index of decimal = "+indexOfDecimal);
		
		System.out.println(input.length()-indexOfDecimal-1);
		
		String decimalPart=input.substring(indexOfDecimal+1);
		System.out.println(decimalPart);
				

	}

}
