/*
 * Task 0021 : linear search in an array
 *
 * Description: this task asks the user to enter a list of numbers and then a target value.
 * The program scans the array from left to right and checks whether the target
 * value is present. If it finds the target, it prints the index where it was found.
 * If not, it prints that the value is not in the array.
 *
 * Concept explained:
 * - reading an array of integers from the user
 * - using a simple loop to check each element one by one
 * - comparing each array element with a target value
 * - using a flag or index to indicate whether the target was found
 *
 * Linear search is the most basic searching algorithm. It is easy to understand
 * and works on any list, even if it is not sorted. Later you will compare this
 * approach with faster methods like binary search.
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
        } //
        System.out.print("Enter value to search for: ");
        int target = sc.nextInt();
        int foundIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Value " + target + " found at index " + foundIndex + ".");
        } else {
            System.out.println("Value " + target + " not found in the array.");
        }
    }
}
