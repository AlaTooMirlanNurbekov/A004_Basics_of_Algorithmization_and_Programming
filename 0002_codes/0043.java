/*
 * Task 0043 : remove all spaces from a string
 *
 * Description:
 * This task asks the user to enter a sentence or phrase. The program removes
 * all spaces from the string and prints the result. This demonstrates a simple
 * but common text-processing operation.
 *
 * Concept explained:
 * - scanning a string character by character
 * - building a new string without spaces
 * - understanding how to filter out unwanted characters
 * - reinforcing basic string manipulation skills
 *
 * Removing spaces is a small but practical example of cleaning or preparing
 * text data, which is often required in applications such as formatting,
 * encryption, data normalization, and input validation.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ' ') {  // keep everything except spaces
                result += ch;
            }
        }

        System.out.println("String without spaces: " + result);
    }
}
