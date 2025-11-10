package codepractice;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		int a[] = { 1, 5, 2, 3, 4, 5 };

		boolean isSorted = true;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				isSorted = false;
			}
		}

		if (isSorted) {
			System.out.println("Array is sorted");
		}
		else {
			System.out.println("Array is not sorted");

		}

	}

}
