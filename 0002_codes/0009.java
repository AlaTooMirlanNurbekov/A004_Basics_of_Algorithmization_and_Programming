/*
 * Task 0009 : simple interest calculation
 *
 * Description:
 * This task asks the user to enter three values: principal amount, interest rate,
 * and time in years. Using these inputs, the program calculates the simple interest
 * using the standard formula and prints the result.
 *
 * Concept explained:
 * - reading multiple numeric inputs from the user
 * - understanding the simple interest formula: SI = (P × R × T) / 100
 * - storing data in variables and performing a multi-step calculation
 * - printing financial results in a clear and readable way
 *
 * This task shows how formulas from real life can be implemented as code.
 * Financial calculations, even simple ones, are common in many software
 * systems such as banking, billing, and accounting.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate (%): ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest = " + si);
    }
}
