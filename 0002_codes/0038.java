/*
 * Task 0038 : print a 2D matrix
 *
 * Description:
 * This task asks the user to enter the number of rows and columns, then reads
 * a 2D matrix (a table of numbers). After storing the values, the program prints
 * the matrix in a clean, row-by-row format.
 *
 * Concept explained:
 * - creating and working with 2D arrays
 * - using nested loops to read values
 * - printing structured data using nested loops
 * - understanding how matrix indexing works (row, column)
 *
 * This task introduces multi-dimensional arrays, which are used in many real
 * applications like images, grids, game boards, and mathematical operations.
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

        System.out.println("Your matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
