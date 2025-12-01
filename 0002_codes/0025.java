/*
 * Task 0025 : insertion sort (ascending)
 *
 * Description:
 * This task asks the user to enter a list of integers and then sorts the array
 * using the insertion sort algorithm. Insertion sort builds the final sorted array
 * one element at a time by shifting larger elements to the right and inserting the
 * current element into its correct position.
 *
 * Concept explained:
 * - using a nested loop structure
 * - storing a "key" value and moving other values to make space
 * - understanding how sorted and unsorted regions of the array evolve
 * - reinforcing the idea of shifting and insertion
 *
 * Insertion sort is more efficient than bubble or selection sort for nearly sorted
 * data. It is commonly used in practice for small datasets or as a final step in
 * more advanced sorting algorithms.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // insertion sort
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // shift elements to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
