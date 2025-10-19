package codepractice;

public class BubbleSortExample {

	public static void main(String[] args) {
		int a[] = { 64, 34, 25, 12, 22, 11, 90 };//output: 11 12 22 25 34 64 90 

		sorting(a);

		System.out.print("Sorted arry is :");
		for(int num:a) {
			System.out.print(num+" ");
		}

	}

	private static void sorting(int a[]) {
		int n = a.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped)
				break;
		}
	}

}
