/*
 * Task 0020 : longest decreasing consecutive subsequence
 * Description:
 * This task asks the user to enter a series of numbers and stores them in an array.
 * The program then finds the length of the longest decreasing consecutive
 * subsequence — meaning how many numbers in a row keep decreasing without
 * breaking the pattern.
 *
 * For example, in the array: 9 7 5 8 4 3  
 * The longest decreasing consecutive subsequences are:  
 * - 9 7 5 → length 3  
 * - 8 4 3 → length 3  
 *
 * Concept explained:
 * - scanning the array while comparing each element to the previous one
 * - increasing a counter when the pattern continues
 * - resetting the counter when the pattern breaks
 * - tracking the maximum run length
 *
 * This task is a mirror version of Task 0018. Together, both tasks help you
 * understand how patterns form inside arrays and how to detect them efficiently.
 * These skills are valuable for algorithm challenges, data analysis, and
 * sequence-based logic problems.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
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
            if (arr[i] < arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        System.out.println("Length of the longest decreasing consecutive subsequence: " + maxLength);
    }
}
