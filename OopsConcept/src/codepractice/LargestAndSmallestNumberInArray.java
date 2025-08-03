package codepractice;

public class LargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int num:arr) {
			if(num>largest) {
				largest=num;
			}
		}
		System.out.println("Largest Number is : "+largest);
		
		for(int num2:arr) {
			if(num2<smallest) {
				smallest=num2;
			}
		}
		System.out.println("Smallest Number is : "+smallest);
	}

}
