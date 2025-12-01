/*
 * Task 0035 : compare linear search and binary search
 *
 * Description: hhis task helps u to understand the difference in efficiency between linear
 * search and binary search. The program asks the user to enter a sorted array
 * and a target value. It then performs:
 *
 * 1) linear search  – checking each element one by one  
 * 2) binary search  – dividing the search space in half each step
 *
 * For each search method, the program counts how many comparisons were made
 * before finding the target (or deciding it is not present).
 *
 * Concept explained:
 * - how linear search works internally
 * - how binary search reduces the search range
 * - counting operations to see efficiency differences
 * - connecting real code with Big-O notation (O(n) vs O(log n))
 *
 * This task prepares you for algorithm analysis and helps you build intuition
 * about why some algorithms are faster than others.
 */

import java.util.Scanner;

public class Main {

    // linear search with comparison counter
    public static int linearSearch(int[] arr, int target) {
        int comparisons = 0;

        for (int num : arr) {
            comparisons++;
            if (num == target) {
                return comparisons;   // found
            }
        }
        return comparisons;           // not found
    }
    // binary search with comparison counter
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int comparisons = 0;

        while (left <= right) {
            comparisons++;
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return comparisons;   // found
            }
            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return comparisons;           // not found
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

        int linearOps = linearSearch(arr, target);
        int binaryOps = binarySearch(arr, target);

        System.out.println("Comparisons made in linear search: " + linearOps);
        System.out.println("Comparisons made in binary search: " + binaryOps);
    }
}
