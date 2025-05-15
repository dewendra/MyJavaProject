package practice;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		System.out.println("Welcome to Java code practice.");
		int numbers[] = { 10, 20, 30, 40, 50 };
		int temp=0;
		for(int i=0; i<numbers.length;i++) {
			
			 temp=temp+numbers[i];
			
		}
		System.out.println("Sum of all numbers :"+temp);

	}

}
