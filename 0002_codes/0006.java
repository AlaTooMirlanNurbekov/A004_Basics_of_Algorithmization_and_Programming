/*
 * Task 0006 : reverse a word
 *
 * Description:
 * This task asks the user to enter a word and then prints the word in reverse
 * order. The program goes through the characters from the end to the beginning
 * and builds a reversed string manually.
 *
 * Concept explained:
 * - reading a string from the user
 * - accessing characters using charAt()
 * - building a new string step by step
 * - understanding loops that run backwards
 *
 * This task helps you practice basic string manipulation, which is an important
 * skill for many algorithmic problems such as palindrome checking, pattern
 * matching, and text processing.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        System.out.println("Reversed word: " + reversed);
    }
}
