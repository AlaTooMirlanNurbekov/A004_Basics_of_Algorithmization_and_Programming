/*
 * Task 0010 : guess the number
 *
 * Description:
 * This task asks the user to guess a secret number between 1 and 10
 * The program compares the user's guess with a fixed secret value and
 * prints whether the guess is correct or not. It is a simple example of
 * using conditions to make decisions
 *
 * Concept explained:
 * - reading an integer from the user
 * - comparing values using if-else
 * - understanding equality checks (==)
 * - printing different outputs based on a condition
 *
 * It builds confidence with basic decision-making in Java
 * Later, similar logic will be used in validation steps, games
 * and more advanced algorithmic branching
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secret = 7;  //fixed secret number

        System.out.print("Guess the number (between 1 and 10): ");
        int guess = sc.nextInt();

        if (guess == secret) {
            System.out.println("Correct! You guessed the number.");
        } else {
            System.out.println("Wrong! The secret number was " + secret);
        }
    }
}
