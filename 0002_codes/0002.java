/*
 * Task 0002 : adding two numbers
 *
 * Description:
 * This task introduces basic arithmetic operations in Java. The program asks the
 * user to enter two numbers and then prints their sum. It is a simple task, but it
 * helps you practice reading integers and performing basic calculations.
 *
 * Concept explained:
 * - using the Scanner class to read numeric input
 * - storing values inside variables
 * - performing addition using the + operator
 * - displaying the result in a clear and readable way
 *
 * Being comfortable with input, variables, and arithmetic is essential, because
 * these ideas appear in almost every algorithm you will write later.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);
    }
}
