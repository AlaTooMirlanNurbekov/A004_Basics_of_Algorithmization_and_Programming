/*
 * Task 0040 : matrix addition
 *
 * Description:
 * This task asks the user to enter the dimensions of two matrices and then input
 * both matrices. The program checks whether the matrices have the same size.
 * If they do, it adds them together element by element and prints the resulting
 * matrix.
 *
 * Concept explained:
 * - working with two 2D arrays
 * - validating matrix dimensions before adding
 * - adding corresponding elements (A[i][j] + B[i][j])
 * - storing results in a new matrix
 *
 * Matrix addition is a common operation in mathematics, engineering,
 * simulations, graphics, and many computational tasks.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] C = new int[rows][cols];

        System.out.println("Enter matrix A values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix B values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        // matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Resulting matrix (A + B):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
