/*
 * Task 0031 : factorial using recursion
 *
 * Description: The user enters a non-negative integer, and the program calculates
 * its factorial using a recursive function. Recursion means that a function calls
 * itself to solve a smaller version of the same problem.
 *
 * Example:
 * 5! = 1 × 2 × 3 × 4 × 5
 *
 * Concept explained:
 * - defining a recursive method
 * - identifying the base case (when to stop)
 * - breaking the problem down into smaller versions
 * - understanding how recursion replaces loops in some algorithms
 *
 * Factorial is one of the most common examples used to introduce recursion,
 * because the definition of n! naturally fits recursive thinking.
 */

import java.util.Scanner;

public class Main {

    // recursive factorial function
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;     // base case
        } //
        return n * factorial(n - 1);  // recursive call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        // this
        long result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
