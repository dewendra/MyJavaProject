package codepractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstNumer=0;//Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 55 89 144
		int secondNumber=1;
		int nextNumber=0;
		//System.out.println("first number is : "+firstNumer);
		//System.out.println("second number is : "+secondNumber);
		
		System.out.print("Fibonacci Series: "+firstNumer+" "+secondNumber);
		for(int i=0;i<=10;i++) {
			nextNumber=firstNumer+secondNumber;
			System.out.print(" "+nextNumber);
			firstNumer=secondNumber;
			secondNumber=nextNumber;
			
		}
		
		

	}

}
