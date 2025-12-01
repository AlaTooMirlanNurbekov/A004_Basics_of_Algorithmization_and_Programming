/*
 * Task 0004 : swap two numbers
 *
 * Description:
 * This task demonstrates how two numbers can be swapped without using
 * an additional temporary variable. The program takes two integers from
 * the user and swaps their values using arithmetic operations.
 *
 * Concept explained:
 * - reading user input
 * - understanding how values are stored in variables
 * - using arithmetic to swap values: a = a + b; b = a - b; a = a - b;
 * - reinforcing the idea of variable manipulation and assignment
 *
 * While modern programming usually uses a temporary variable for clarity,
 * this method is a good exercise in understanding how values move
 * between variables. It builds a stronger foundation for algorithmic thinking.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // swapping without a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
