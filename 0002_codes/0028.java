/*
 * Task 0028 : count swaps in bubble sort
 *
 * Description: this task asks the user to enter a list of numbers. The program sorts the array
 * using bubble sort, but this time it also counts how many swaps are performed
 * during the sorting process. The number of swaps helps you understand how
 * much work the algorithm is doing.
 *
 * Concept explained:
 * - bubble sort logic (comparing and swapping neighbors)
 * - using a counter variable to track operations
 * - understanding that more swaps often indicate a less ordered initial array
 * - connecting algorithm behavior with performance insights
 *
 * Counting swaps is a simple way to introduce algorithm analysis. It helps you
 * see why bubble sort is inefficient and why more advanced sorting algorithms
 * are needed for larger datasets.
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
        int swapCount = 0;
        // bubble sort with swap counting
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nTotal swaps made: " + swapCount);
    }
}
