/*
 * Task 0037 : palindrome check using recursion
 *
 * Description:
 * This task asks the user to enter a string and checks whether it is a palindrome.
 * A palindrome is a word that reads the same forward and backward, such as:
 * "level", "madam", "racecar".
 *
 * The program uses a recursive function that compares the first and last
 * characters, then moves inward until the entire string is checked.
 *
 * Concept explained:
 * - recursive problem breakdown
 * - base cases: empty string or single character
 * - comparing characters at symmetric positions
 * - using substring() to reduce problem size
 *
 * This task strengthens your understanding of recursion and string processing.
 * Palindrome checks are common in algorithm training and interview problems.
 */

import java.util.Scanner;

public class Main {
    // recursive palindrome checker
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;   // base case: empty or one-character string
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;  // not a palindrome
        }
        return isPalindrome(s.substring(1, s.length() - 1));  // check inner part
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}
