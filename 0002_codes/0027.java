/*
 * Task 0027 : remove duplicates after sorting
 *
 * Description: this task asks the user to enter several integers. The program first sorts the
 * array in ascending order, and then removes duplicates by printing each unique
 * value only once. This is a common step in data cleaning and preprocessing.
 *
 * Concept explained:
 * - sorting an array using a simple comparison-based method
 * - understanding how duplicates become neighbors after sorting
 * - scanning the sorted array to print only unique values
 * - reinforcing how sorting helps simplify later operations
 *
 * Duplicate removal is common in many real applications such as reporting,
 * statistics, databases, and search systems. This task helps you practice
 * recognizing patterns inside sorted data.
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
        // sort the array
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // print unique values
        System.out.println("Unique values:");
        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
