/*
 * Task 0005 : count digits in a number
 *
 * Description:
 * The user must enter an integer and then calculates how many
 * digits the number contains. It uses a loop to repeatedly divide the number
 * by 10 until no digits remain.
 *
 * Concept explained:
 * - reading an integer from the user
 * - using a while loop to process a number step by step
 * - integer division to remove the last digit (n = n / 10)
 * - using a counter variable to track progress
 *
 * This task strengthens your understanding of loops, division, and how data
 * changes over time. These ideas are important for many algorithms such
 * as reversing numbers, checking palindromes, and digit-based operations.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp != 0) {
            count++;
            temp = temp / 10;  // remove the last digit
        }

        System.out.println("Number of digits in " + num + " is: " + count);
    }
}
