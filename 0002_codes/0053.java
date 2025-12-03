/*
 * Task 0053 : recursive binary search
 *
 * Description:
 * This task asks the user to enter a sorted array and a target value. The program
 * uses a recursive function to search for the target using the binary search
 * algorithm. Instead of a loop, the function calls itself with a smaller range
 * until the value is found or the range becomes empty.
 *
 * Concept explained:
 * - recursive search in a sorted array
 * - dividing the search space in half each step
 * - base cases (value found or range invalid)
 * - middle index calculation and comparison
 *
 * Recursive binary search is important because it shows how divide-and-conquer
 * algorithms can be written in a clean, elegant way using recursion.
 */

import java.util.Scanner;

public class Main {

    // recursive binary search method
    public static int recursiveBinarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; // base case: not found
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid; // value found
        }

        if (target < arr[mid]) {
            return recursiveBinarySearch(arr, left, mid - 1, target);
        } else {
            return recursiveBinarySearch(arr, mid + 1, right, target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to search for: ");
        int target = sc.nextInt();

        int result = recursiveBinarySearch(arr, 0, n - 1, target);

        if (result != -1) {
            System.out.println("Value found at index " + result + ".");
        } else {
            System.out.println("Value not found in the array.");
        }
    }
}
