/*
 * Task 0039 : sum of all elements in a 2D matrix
 *
 * Description:
 * This task asks the user to enter the dimensions of a 2D matrix and then
 * input all values. After storing the matrix, the program calculates the sum
 * of all elements and prints the final result.
 *
 * Concept explained:
 * - reading and storing values in a 2D array
 * - using nested loops to process all elements
 * - accumulating a running total
 * - reinforcing how matrix traversal works
 *
 * Summing all values in a matrix is a common operation in mathematics,
 * data processing, image analysis, and many computational algorithms.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
