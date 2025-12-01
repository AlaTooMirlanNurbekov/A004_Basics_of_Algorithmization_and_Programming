/*
 * Task 0011 : star pattern - right triangle
 *
 * Description:
 * This task asks the user to enter the number of rows and then prints a simple
 * right triangle made of stars (*). Each row contains one more star than the
 * previous row. Pattern printing helps build confidence with nested loops.
 *
 * Concept explained:
 * - using nested loops (a loop inside another loop)
 * - controlling how many characters appear on each line
 * - understanding how patterns are built row by row
 *
 * Pattern tasks are a classic way to practice loop structure and understand
 * how repeated actions create shapes, visuals, or structured text output.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
