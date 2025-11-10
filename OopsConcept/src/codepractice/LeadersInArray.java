package codepractice;

public class LeadersInArray {

	public static void main(String[] args) {
		//An element in an array is called a leader if no element to its right is greater than it.
		int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        int maxFromRight = arr[n - 1];
        System.out.print("Leaders: " + maxFromRight + " ");

        // Traverse array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
		

	}

}
