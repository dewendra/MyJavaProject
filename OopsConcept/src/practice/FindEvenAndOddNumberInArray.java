package practice;

public class FindEvenAndOddNumberInArray {

	public static void main(String[] args) {
		System.out.println("Welcome to Java code practice.");
		int numbers[] = { 10, 15, 20, 25, 30 };
		int evencount = 0;
		int oddcount = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
			
		}
		System.out.println("total even number is :" + evencount);
		System.out.println("total even number is :" + oddcount);
	}

}
