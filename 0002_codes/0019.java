/*
 * Task 0019 : most frequent number
 *
 * Description:
 * This task asks the user to enter several integers and stores them in an array.
 * The program then finds which number appears most often (the mode) and how
 * many times it appears. If there is a tie, the program chooses the larger value
 * among the numbers with the same highest frequency.
 *
 * Concept explained:
 * - reading multiple values into an array
 * - using nested loops to compare each element with the rest
 * - counting how many times a value appears
 * - tracking the current "best" result using maxCount and mostFrequent
 *
 * This task introduces the idea of frequency analysis, which is useful in many
 * real situations: statistics, voting systems, log analysis, and data compression.
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

        int mostFrequent = arr[0];
        int maxCount = 1;

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            //
            if (count > maxCount || (count == maxCount && arr[i] > mostFrequent)) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }

        System.out.println("Most frequent number: " + mostFrequent);
        System.out.println("It appears " + maxCount + " times."); //
    }
}
