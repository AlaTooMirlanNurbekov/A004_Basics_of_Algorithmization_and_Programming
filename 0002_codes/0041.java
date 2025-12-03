/*
 * Task 0041 : matrix multiplication
 *
 * Description:
 * This task asks the user to enter the dimensions and values of two matrices.
 * The program checks whether matrix multiplication is possible. If valid, it
 * multiplies the matrices and prints the resulting product matrix.
 *
 * For multiplication to be valid:
 * If A is (rowsA × colsA) and B is (rowsB × colsB),
 * then colsA must equal rowsB.
 *
 * Concept explained:
 * - validating dimensions for multiplication
 * - nested loops to multiply rows by columns
 * - computing each cell as the sum of products
 *   C[i][j] = Σ (A[i][k] × B[k][j])
 * - understanding one of the most important operations in linear algebra
 *
 * Matrix multiplication is widely used in graphics, machine learning,
 * physics simulations, computer vision, and many core algorithms.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // dimensions for matrix A
        System.out.print("Enter rows of matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter columns of matrix A: ");
        int colsA = sc.nextInt();

        // dimensions for matrix B
        System.out.print("Enter rows of matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter columns of matrix B: ");
        int colsB = sc.nextInt();

        // multiplication validity check
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible (colsA must equal rowsB).");
            return;
        }

        int[][] A = new int[rowsA][colsA];
        int[][] B = new int[rowsB][colsB];
        int[][] C = new int[rowsA][colsB];

        System.out.println("Enter values for matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values for matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // matrix multiplication logic
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        System.out.println("Resulting matrix (A × B):");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
