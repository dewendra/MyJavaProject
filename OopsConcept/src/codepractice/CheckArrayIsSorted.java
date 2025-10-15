package codepractice;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 3, 4, 5 };

		boolean isSorted = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false;
			}
		}

		if (isSorted) {
			System.out.println("Array is sorted");
		}
		if (!isSorted) {
			System.out.println("Array is not sorted");

		}

	}

}
