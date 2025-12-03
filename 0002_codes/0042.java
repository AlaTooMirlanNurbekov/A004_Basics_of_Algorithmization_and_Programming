/*
 * Task 0042 : count vowels and consonants
 *
 * Description:
 * This task asks the user to enter a string. The program then counts how many
 * vowels and consonants the string contains. Only alphabetic characters are
 * considered; spaces, numbers, and symbols are ignored.
 *
 * Concept explained:
 * - scanning a string character by character
 * - checking if a letter is a vowel or consonant
 * - converting characters to lowercase for easier comparison
 * - ignoring non-alphabetic characters
 *
 * Counting vowels and consonants is a practical example of string processing.
 * These skills are useful in text analysis, file processing, and many algorithmic tasks.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {  // alphabet check

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
