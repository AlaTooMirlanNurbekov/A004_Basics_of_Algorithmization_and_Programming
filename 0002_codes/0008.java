/*
 * Task 0008 : temperature conversion (Celsius to Fahrenheit)
 *
 * Description:
 * This task asks the user to enter a temperature in degrees Celsius and then
 * converts it to Fahrenheit using the standard formula. It is a simple and
 * practical example of how mathematical expressions are used in programs.
 *
 * Concept explained:
 * - reading a decimal (double) value from the user
 * - applying a mathematical formula: F = (C × 9/5) + 32
 * - storing and printing results in a clear format
 *
 * Temperature conversion is a small task, but it shows how user input and
 * arithmetic combine to create meaningful calculations in real applications.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " °C = " + fahrenheit + " °F");
    }
}
