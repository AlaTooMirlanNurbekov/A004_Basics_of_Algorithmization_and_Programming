/*
 * Task 0015 : sum of even and odd numbers
 *
 * Description:
 * This task asks the user to enter several integers, stores them in an array,
 * and then calculates two separate values: the sum of all even numbers and
 * the sum of all odd numbers. It is a simple but useful data-processing task.
 *
 * Concept explained:
 * - reading multiple integers into an array
 * - checking whether a number is even or odd using the % operator
 * - keeping separate running totals for two categories
 * - scanning an array using an enhanced for-loop
 *
 * This task builds confidence in working with arrays and conditional checks.
 * Grouping and analyzing values is a common step in many real applications,
 * such as statistics, reports, and data filtering.
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

        int evenSum = 0;
        int oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
