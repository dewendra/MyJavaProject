package codepractice;

public class ArrangeArray {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 1, 0, 1, 0 };
		int countOne = 0;
		for (int num : arr) {
			if (num == 1) {
				countOne++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < countOne) {
				arr[i] = 1;
			} else {
				arr[i] = 0;
			}
		}
		for (int num : arr) {
			System.out.print(num+",");

		}
	}

}
