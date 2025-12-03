/*
 * Task 0052 : qick sort (recursive)
 *
 * Description:
 * This task asks the user to enter several integers and sorts them using the
 * quick sort algorithm. Quick sort is another "divide and conquer" method.
 * It chooses a pivot, partitions the array into two sides, and recursively sorts
 * each side.
 *
 * Concept explained:
 * - choosing a pivot element
 * - partitioning: placing smaller values on the left, larger values on the right
 * - recursive sorting of the left and right partitions
 * - understanding average-case O(n log n) performance
 *
 * Quick sort is widely used in real systems and is one of the most important
 * algorithms in computer science.
 */

import java.util.Scanner;

public class Main {

    // partition method: places pivot correctly and returns pivot index
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1;       // pointer for smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // quick sort recursive function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);  // sort left side
            quickSort(arr, pivotIndex + 1, high); // sort right side
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        System.out.print("Sorted array (quick sort): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
