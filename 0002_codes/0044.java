/*
 * Task 0044 : most frequent character in a string
 *
 * Description:
 * This task asks the user to enter a string. The program scans the text and
 * finds the character that appears most often. Spaces are ignored, and the
 * comparison is case-insensitive.
 *
 * Concept explained:
 * - converting text to lowercase for consistent comparison
 * - counting the frequency of each character using nested loops
 * - ignoring spaces to focus on meaningful characters
 * - tracking the most frequent character and its count
 *
 * Character frequency analysis is useful in text compression, cryptography,
 * natural language processing, and many algorithmic problems.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        char mostFrequent = ' ';
        int maxCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                continue;  // skip spaces
            }

            int count = 1;

            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = ch;
            }
        }

        System.out.println("Most frequent character: " + mostFrequent);
        System.out.println("It appears " + maxCount + " times.");
    }
}
