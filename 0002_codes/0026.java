/*
 * Task 0026 : sort strings alphabetically
 *
 * Description:
 * This task asks the user to enter several words and stores them in a string array.
 * The program then sorts the words in alphabetical order using a simple
 * comparison-based sorting approach. Instead of numbers, this task focuses on
 * sorting text.
 *
 * Concept explained:
 * - storing user input in a string array
 * - comparing strings using compareTo()
 * - swapping values based on alphabetical order
 * - understanding how sorting applies to non-numerical data
 *
 * Sorting strings is very common in real applications: contact lists, file names,
 * search results, and many interfaces rely on alphabetical ordering.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer
        String[] arr = new String[n];

        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        // simple alphabetical sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted words:");
        for (String word : arr) {
            System.out.println(word);
        }
    }
}
