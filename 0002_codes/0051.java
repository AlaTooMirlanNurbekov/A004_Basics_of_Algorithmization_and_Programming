/*
 * Task 0051 : merge sort (recursive)
 *
 * Description:
 * This task asks the user to enter a list of integers and sorts the array using
 * the merge sort algorithm. Merge sort is a classic example of a "divide and
 * conquer" algorithm: it splits the array into smaller parts, sorts each part,
 * and then merges the sorted parts back together.
 *
 * Concept explained:
 * - recursive problem solving (splitting the array into halves)
 * - base case: subarray of size 1 is already sorted
 * - merging two sorted halves into one sorted array
 * - understanding divide and conquer strategy
 *
 * Merge sort has time complexity O(n log n) and is much more efficient than
 * simple algorithms like bubble sort for large datasets.
 */

import java.util.Scanner;

public class Main {

    // merge two sorted subarrays: arr[left..mid] and arr[mid+1..right]
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;  // size of left half
        int n2 = right - mid;     // size of right half

        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0;     // index for L
        int j = 0;     // index for R
        int k = left;  // index for main array

        // merge the two halves back into arr
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy any remaining elements of L
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // copy any remaining elements of R
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // recursive merge sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;  // base case: one element
        }

        int mid = (left + right) / 2;

        // sort left half
        mergeSort(arr, left, mid);

        // sort right half
        mergeSort(arr, mid + 1, right);

        // merge the two sorted halves
        merge(arr, left, mid, right);
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

        mergeSort(arr, 0, n - 1);

        System.out.print("Sorted array (merge sort): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
