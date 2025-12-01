/*
 * Task 0036 : big-O observation for sorting algorithms
 *
 * Description:
 * This task helps you understand how different sorting algorithms behave.
 * The user enters a list of numbers, and the program performs three sorts:
 *
 * 1) bubble sort  
 * 2) selection sort  
 * 3) insertion sort  
 *
 * For each algorithm, the program counts how many comparisons were made.
 * This gives you a practical, hands-on feel for their time complexity.
 *
 * Concept explained:
 * - how bubble, selection, and insertion sort work step by step
 * - counting comparisons as a simple form of algorithm analysis
 * - understanding why some algorithms take more operations than others
 * - introduction to Big-O notation through real data (O(n²) behavior)
 *
 * This task is not about perfect performance measurement — it is about
 * building intuition through observation.
 */

import java.util.Scanner;

public class Main {

    // bubble sort comparison counter
    public static int bubbleComparisons(int[] arr) {
        int count = 0;
        int n = arr.length;
        int[] a = arr.clone();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                count++;
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return count;
    }
    // selection sort comparison counter
    public static int selectionComparisons(int[] arr) {
        int count = 0;
        int n = arr.length;
        int[] a = arr.clone();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                count++;
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        return count;
    }
    // insertion sort comparison counter
    public static int insertionComparisons(int[] arr) {
        int count = 0;
        int n = arr.length;
        int[] a = arr.clone();

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0) {
                count++;          // comparison happens here

                if (a[j] > key) {
                    a[j + 1] = a[j];
                    j--;
                } else {
                    break;
                }
            }
            a[j + 1] = key;
        }

        return count;
    }
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

        int bubbleOps = bubbleComparisons(arr);
        int selectionOps = selectionComparisons(arr);
        int insertionOps = insertionComparisons(arr);

        System.out.println("Bubble sort comparisons: " + bubbleOps);
        System.out.println("Selection sort comparisons: " + selectionOps);
        System.out.println("Insertion sort comparisons: " + insertionOps);
    }
}
