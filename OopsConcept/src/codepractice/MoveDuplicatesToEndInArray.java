package codepractice;

public class MoveDuplicatesToEndInArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 4, 6, 7, 8, 9, 10};//output: 1 2 3 4 5 6 7 8 9 10 1 2 4 
        int n = arr.length;
        boolean isDuplicate[] = new boolean[n];
        System.out.println("Length of array is : " + n);

        // Mark duplicates
        for (int i = 0; i < n; i++) {
            if (isDuplicate[i]) continue;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate[j] = true;
                }
            }
        }

        // Create a new array to store the result
        int[] result = new int[n];
        int uniqueIndex = 0;

        // First place unique elements at the beginning
        for (int i = 0; i < n; i++) {
            if (!isDuplicate[i]) {
                result[uniqueIndex++] = arr[i];
            }
        }

        // Then place duplicates at the end
        for (int i = 0; i < n; i++) {
            if (isDuplicate[i]) {
                result[uniqueIndex++] = arr[i];
            }
        }

        // Copy the result back to the original array
        System.arraycopy(result, 0, arr, 0, n);

        // Print the array
        System.out.println("Array after moving duplicates to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}