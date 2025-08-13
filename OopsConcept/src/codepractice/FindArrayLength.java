package codepractice;

public class FindArrayLength {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int count=0;
		
		try {
			while(true) {
				int temp=arr[count];
				count++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Number of element is : "+count);

	
	
	//through for each loop
	int count1=0;
	for(int value:arr) {
		count1++;
	}
	System.out.println("Number of element is : "+count1);
	
	
	
	
	//through built in method
	System.out.println("Numner of element is : " +arr.length);
	}
}
