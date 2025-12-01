/*
 * Task 0032 : fibonacci number using recursion
 * Description: this task asks the user to enter a position n, and the program returns the nth
 * Fibonacci number using a recursive function. The Fibonacci sequence starts with:
 * 0, 1, 1, 2, 3, 5, 8, ...
 *
 * Each number is the sum of the previous two:
 * F(n) = F(n - 1) + F(n - 2)
 *
 * Concept explained:
 * - defining a recursive function with two recursive calls
 * - identifying base cases (F(0) and F(1))
 * - understanding how recursion can grow exponentially
 * - preparing for discussions about efficiency and time complexity
 *
 * Fibonacci is a classic recursion problem and also a good example of why some
 * recursive solutions are inefficient without optimization.
 */

import java.util.Scanner;

public class Main {

    // recursive fibonacci function
    public static int fibonacci(int n) {
        if (n == 0) return 0;   // base case
        if (n == 1) return 1;   // base case
        return fibonacci(n - 1) + fibonacci(n - 2);  // recursive call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a position (n): ");
        int n = sc.nextInt();
        int result = fibonacci(n);

        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
