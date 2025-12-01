/*
 * Task 0012 : reverse an array
 *
 * Description:
 * This task asks the user to enter a number of elements and then reads those
 * values into an array. After the input is complete, the program prints the array
 * in reverse order. It helps you practice working with arrays and indexing.
 *
 * Concept explained:
 * - creating an array based on user input
 * - storing values using a loop
 * - accessing elements from the last index down to the first
 * - understanding how array boundaries work
 *
 * Reversing an array is a common operation in many algorithms and is a good
 * way to get comfortable with loops and indexing.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
//
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Reversed array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
