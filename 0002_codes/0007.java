/*
 * Task 0007 : sum of digits
 *
 * Description:
 * This task asks the user to enter a number, then calculates the sum of all its
 * digits. The program repeatedly extracts the last digit using the modulo
 * operator and adds it to a running total.
 *
 * Concept explained:
 * - reading an integer from the user
 * - using the modulo operator (%) to extract the last digit
 * - removing the last digit using integer division (/)
 * - using a loop to process each digit one by one
 *
 * This task strengthens your understanding of how numbers can be broken
 * down and processed step by step. These techniques are useful in many
 * algorithms, such as digital root calculation, checksum formulas, and
 * number-based logic problems.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        while (temp > 0) {
            sum += temp % 10;   // take the last digit
            temp = temp / 10;   // remove the last digit
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}
