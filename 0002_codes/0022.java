/*
 * Task 0022 : binary search
 *
 * Description:
 * This task asks the user to enter a sorted array of integers and then a target
 * value. The program performs a binary search, which repeatedly divides the
 * search range in half until the value is found or the range becomes empty.
 * Concept explained:
 * - binary search only works on sorted arrays
 * - using left, right, and mid indexes to control the search space
 * - comparing the target with the middle element
 * - moving the search boundaries based on comparisons
 *
 * Binary search is much faster than linear search, especially for large datasets.
 * It is a key algorithm in computer science and appears in libraries, databases,
 * and many real systems that require fast lookups.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //
        System.out.print("Enter value to search for: ");
        int target = sc.nextInt();
        int left = 0;
        int right = n - 1;
        int foundIndex = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                foundIndex = mid;
                break;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Value " + target + " found at index " + foundIndex + ".");
        } else {
            System.out.println("Value " + target + " not found in the array.");
        }
    }
}
