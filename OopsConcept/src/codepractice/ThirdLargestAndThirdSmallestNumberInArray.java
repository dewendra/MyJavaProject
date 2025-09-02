package codepractice;

public class ThirdLargestAndThirdSmallestNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		
		int firstSmallest =Integer.MAX_VALUE;
		int secondSmallest =Integer.MAX_VALUE;
		int thirdSmallest =Integer.MAX_VALUE;
		

		for (int num : arr) {
			if (num > firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = firstLargest;
				firstLargest = num;
			} else if (num > secondLargest && num != firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = num;
			}else if (num>thirdLargest && num!=secondLargest) {
				thirdLargest=num;
			}
		}
		System.out.println("Third largest number is : "+thirdLargest);
		
		for(int num2:arr) {
			if(num2<firstSmallest) {
				thirdSmallest=secondSmallest;
				secondLargest=firstSmallest;
				firstSmallest=num2;
			}else if (num2<secondSmallest && num2!=firstSmallest) {
				thirdSmallest=secondSmallest;
				secondSmallest=num2;
			}else if (num2<thirdSmallest && num2!=secondSmallest) {
				thirdSmallest=num2;
			}
		}
		System.out.println("Third smallest number is : "+thirdSmallest);

	}
	

}
