/*
 * Task 0033 : sum of digits using recursion
 *
 * Description:
 * This task asks the user to enter an integer and then calculates the sum of its
 * digits using a recursive function. The program repeatedly strips off the last
 * digit and adds it to the sum until no digits remain.
 *
 * Example:
 * Input:  534
 * Output: 5 + 3 + 4 = 12
 *
 * Concept explained:
 * - using recursion to break a problem into smaller pieces
 * - identifying the base case (when the number becomes 0)
 * - using modulo (%) to extract digits
 * - using integer division (/) to remove digits
 *
 * This task helps you understand how recursive functions process a number step
 * by step, similar to how loops work but with a different style of thinking.
 */

import java.util.Scanner;

public class Main {

    // recursive function to compute digit sum
    public static int digitSum(int n) {
        if (n == 0) {
            return 0;   // base case
        }
        return (n % 10) + digitSum(n / 10);  // recursive call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = digitSum(n);
        System.out.println("Sum of digits in " + n + " is: " + result);
    }
}
