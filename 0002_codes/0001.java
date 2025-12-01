/*
 * Task 0001 : basic input
 *
 * Description:
 * This task introduces simple user input in java. The program asks for a name
 * and an age, then prints a short message back to the user. It helps you get
 * comfortable with the Scanner class and reading different data types.
 *
 * Concept explained:
 * - how to create a Scanner object to read input from the keyboard
 * - how to read a string using nextLine()
 * - how to read an integer using nextInt()
 * - how to combine text and variables into one printed sentence
 *
 * These small steps are important because almost every program needs to take
 * input, process it, and show something back to the user.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
