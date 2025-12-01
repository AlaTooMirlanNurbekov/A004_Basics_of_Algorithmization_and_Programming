/*
 * Task 0018 : longest increasing consecutive subsequence
 *
 * Description:
 * This task asks the user to enter a sequence of numbers and stores them in an
 * array. The program then finds the length of the longest increasing consecutive
 * subsequence — meaning how many numbers in a row keep increasing without
 * breaking the pattern.
 *
 * For example, in the array: 3 5 7 2 4 6 1  
 * The longest increasing consecutive subsequences are:  
 * - 3 5 7 → length 3  
 * - 2 4 6 → length 3  
 *
 * Concept explained:
 * - scanning an array while comparing each element to the previous one
 * - counting streaks or runs of increasing values
 * - resetting the counter when the pattern breaks
 * - tracking the maximum length found
 *
 * This task is a good introduction to pattern detection inside arrays. It builds
 * the foundation for more advanced sequence problems used in algorithm
 * challenges and interviews.
 */

import java.util.Scanner;

public class LongestIncreasingConsecutiveSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        System.out.println("Length of the longest increasing consecutive subsequence: " + maxLength);
    }
}
