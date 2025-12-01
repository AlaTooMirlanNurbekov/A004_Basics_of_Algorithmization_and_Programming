/*
 * Task 0014 : check if the ascending array is sorted
 *
 * Description:
 * This task asks the user to enter a list of numbers and then checks whether
 * the array is sorted in ascending order. The program scans the array from
 * left to right and looks for any place where a value is greater than the next one.
 *
 * Concept explained:
 * - reading elements into an array
 * - scanning an array using a loop
 * - comparing neighbors (arr[i] and arr[i + 1])
 * - using a boolean flag to track whether the array stays sorted
 *
 * This is an important concept because many algorithms assume the input
 * data is already sorted. Understanding how to verify this condition is useful
 * in searching, merging, and validating datasets.
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
            arr[i] = sc.nextInt(); //
        }

        boolean sorted = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
