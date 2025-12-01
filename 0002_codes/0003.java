/*
 * Task 0003 : even or odd check
 *
 * Description:
 * This task focuses on simple decision-making using an if-else statement.
 * The program asks the user to enter a number and then checks whether
 * the number is even or odd. This is a classic beginner problem that helps
 * you understand how conditional logic works.
 *
 * Concept explained:
 * - reading an integer from the user
 * - using the modulo operator (%) to test divisibility
 * - applying if-else statements to choose between two outcomes
 * - printing clear, readable output based on a condition
 *
 * Mastering basic conditions like this prepares you for more complex
 * algorithmic decisions later in the course.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
