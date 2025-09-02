package codepractice;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};//output: 50 40 30 20 10 
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}

}
