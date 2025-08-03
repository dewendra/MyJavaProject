package codepractice;

public class SecondSmallestAndSecondLargestNumberInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		int seconSmallest=Integer.MAX_VALUE;
		
		for(int num:a) {
			if(num>largest) {
				secondLargest=largest;
				largest=num;
				
			}else {
				if(num>secondLargest && num!=largest) {
					secondLargest=num;
				}
			}}
			if(secondLargest==Integer.MIN_VALUE) {
				System.out.println("Second largest number is not found");
			}
			else {
				System.out.println("Second largest number is "+secondLargest);
			}
			
			for(int num2:a) {
				if(num2<smallest) {
					seconSmallest=smallest;
					smallest=num2;
				}else if(num2<seconSmallest && num2 !=smallest) {
					seconSmallest=num2;
				}
			}
			if(seconSmallest==Integer.MAX_VALUE) {
				System.out.println("Second smallest number is not found");
			}else {
				System.out.println("Second smallest number is "+seconSmallest);
			}
		}
	

}
