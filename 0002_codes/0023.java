/*
 * Task 0023 : ascending bubble sort 
 *
 * Description: this task asks the user to enter a list of numbers and then sorts the array
 * using the bubble sort algorithm. Bubble sort works by repeatedly comparing
 * neighboring elements and swapping them if they are in the wrong order.
 *
 * Concept explained:
 * - nested loops for repeated comparisons
 * - swapping elements when arr[j] > arr[j + 1]
 * - understanding how each pass pushes the largest value to the end
 * - learning how basic sorting algorithms operate internally
 *
 * Bubble sort is not very efficient for large datasets, but it is an excellent
 * introductory sorting method for learning how comparisons and swaps build
 * a sorted array step by step.
 */

import java.util.Scanner;
//
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
        // bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
