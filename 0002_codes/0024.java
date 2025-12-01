/*
 * Task 0024 : selection sort (ascending)
 *
 * Description:
 * This task asks the user to enter a list of numbers and then sorts the array
 * using the selection sort algorithm. The idea is simple: for each position in the
 * array, find the smallest remaining element and place it in that position.
 *
 * Concept explained:
 * - scanning the unsorted part of the array to find the minimum value
 * - swapping the found minimum into the correct position
 * - using nested loops (outer loop for positions, inner loop for searching)
 * - understanding how sorted and unsorted sections evolve
 *
 * Selection sort is another foundational sorting algorithm. It is easy to
 * understand, predictable, and helps build a strong intuition about how
 * sorting works at a low level.
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
        // selection sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // find the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap into correct position
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
