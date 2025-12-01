/*
 * Task 0016 : maximum and minimum in an array
 *
 * Description:
 * This task asks the user to enter several numbers and stores them in an array.
 * After that, the program scans through the array to find the maximum and the
 * minimum values. It does this in a single pass, updating the tracked values as
 * it goes.
 *
 * Concept explained:
 * - reading numbers into an array
 * - initializing max and min using the first element
 * - scanning the array with a loop
 * - updating values based on comparisons
 *
 * Finding the maximum and minimum is a very common operation in many
 * algorithms. It helps you understand how to process a collection of values
 * while keeping track of important information along the way.
 */
//
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
//
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
