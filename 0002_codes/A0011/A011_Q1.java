import java.util.Scanner;

public class Q1MergeSort {

    // In this solution I use recursion because merge sort is naturally "divide and conquer".
    // The array is repeatedly split in half, then I merge two sorted halves back together.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array (ascending):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return; // base case: one element
        }

        int mid = (left + right) / 2;

        // sort left half
        mergeSort(arr, left, mid);

        // sort right half
        mergeSort(arr, mid + 1, right);

        // merge two sorted halves
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // copy data
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        // merge until one side is finished
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // copy remaining elements (if any)
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
