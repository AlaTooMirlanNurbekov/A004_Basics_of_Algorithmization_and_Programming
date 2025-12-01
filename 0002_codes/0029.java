/*
 * Task 0029 : maximum balue function
 *
 * Description:
 * This task introduces the idea of writing reusable functions. The program asks
 * the user to enter several integers, stores them in an array, and then calls a
 * function that returns the maximum value in the array.
 *
 * Concept explained:
 * - defining a separate method outside main()
 * - passing an array as a function parameter
 * - returning a single computed value
 * - reinforcing modular programming and clean code structure
 *
 * Breaking logic into functions makes code easier to read, reuse, and test.
 * This is an important step toward writing larger, well-organized programs.
 */

import java.util.Scanner;

public class Main {
    // function that returns the maximum value
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxValue = findMax(arr);
        System.out.println("Maximum value in the array: " + maxValue);
    }
}
