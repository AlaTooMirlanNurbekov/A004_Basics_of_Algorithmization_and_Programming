/*
 * Task 0017 : second largest and second smallest
 *
 * Description:
 * This task asks the user to enter several numbers and stores them in an array.
 * The program then finds both the second largest and second smallest values.
 * It does this by scanning through the array once and updating four tracked
 * variables as it goes.
 *
 * Concept explained:
 * - reading multiple elements into an array
 * - using Integer.MIN_VALUE and Integer.MAX_VALUE as initial placeholders
 * - understanding how to update multiple values in a single loop
 * - comparing values while avoiding duplicates of the largest or smallest
 *
 * This type of task is common in algorithm practice because it strengthens your
 * ability to track multiple conditions simultaneously. It builds the logic needed
 * for more advanced selection and ranking problems.
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

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        //
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            // update largest values
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }

            // update smallest values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2 && num != min1) {
                min2 = num;
            }
        }

        System.out.println("Second largest number: " + max2);
        System.out.println("Second smallest number: " + min2);
    }
}
