/*
 * Task 0030 : factorial using a loop (iterative)
 *
 * Description:
 * This task asks the user to enter a non-negative integer and calculates its
 * factorial using a simple loop. The factorial of a number (n!) is the product of
 * all positive integers from 1 to n.
 *
 * Example:
 * 5! = 1 × 2 × 3 × 4 × 5 = 120
 *
 * Concept explained:
 * - reading an integer from the user
 * - using a for-loop to build a running product
 * - understanding iterative problem-solving
 * - preparing for the next task, which will use recursion instead
 *
 * Factorial is a classic example used in algorithm courses to explain loops,
 * recursion, and mathematical problem-solving.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
//