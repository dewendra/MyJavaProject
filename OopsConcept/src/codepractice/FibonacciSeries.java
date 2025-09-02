package codepractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstNumer=0;
		int secondNumber=1;
		int sum=0;
		//System.out.println("first number is : "+firstNumer);
		//System.out.println("second number is : "+secondNumber);
		
		System.out.print("Fibonacci Series: "+firstNumer+" "+secondNumber);
		for(int i=0;i<10;i++) {
			sum=firstNumer+secondNumber;
			System.out.print(" "+sum);
			firstNumer=secondNumber;
			secondNumber=sum;
			
		}
		
		

	}

}
