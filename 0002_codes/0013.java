/*
 * Task 0013 : second largest element
 *
 * Description:
 * This task asks the user to enter a set of numbers, stores them in an array,
 * and then finds the second largest value. It does this by scanning through
 * the array once and keeping track of the largest and second largest numbers.
 *
 * Concept explained:
 * - reading multiple values into an array
 * - using Integer.MIN_VALUE as an initial placeholder
 * - comparing numbers using if-else logic
 * - updating tracked values during a single pass
 *
 * Finding the second largest element is a common interview-style problem.
 * It helps you think about how to update multiple variables while iterating
 * through a collection of data.
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

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest number is: " + secondLargest);
    }
}
