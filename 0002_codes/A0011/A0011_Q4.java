import java.util.Scanner;

public class Q4NQueens {

    // Here I solve N-Queens using recursion and backtracking.
    // I place queens row by row. If a placement leads to a conflict later,
    // I "undo" it (backtrack) and try the next column.
    private static int N;
    private static int[][] board;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N (board size): ");
        N = scanner.nextInt();

        board = new int[N][N];

        if (solveNQueens(0)) {
            System.out.println("One valid arrangement:");
            printBoard();
        } else {
            System.out.println("No solution exists for N = " + N);
        }
    }

    private static boolean solveNQueens(int row) {
        if (row == N) {
            return true; // all queens placed
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1; // place queen

                if (solveNQueens(row + 1)) {
                    return true;
                }

                // backtrack: undo placement
                board[row][col] = 0;
            }
        }

        return false; // no valid position in this row
    }

    private static boolean isSafe(int row, int col) {
        // check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}
