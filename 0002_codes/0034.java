/*
 * Task 0034 : reverse a string using recursion
 *
 * Description:
 * This task asks the user to enter a string and then reverses it using a recursive
 * function. Instead of using a loop, the function processes one character at a
 * time and builds the reversed string during the return phase.
 *
 * Example:
 * Input:  "hello"
 * Output: "olleh"
 *
 * Concept explained:
 * - recursive processing of a string
 * - identifying the base case when the string becomes empty
 * - using substring() to reduce the problem size
 * - combining characters during the return step
 *
 * This task reinforces how recursion can replace loops, especially when a
 * problem can be broken down into smaller string operations.
 */

import java.util.Scanner;

public class Main {

    // recursive string reversal
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return "";   // base case
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }
}
