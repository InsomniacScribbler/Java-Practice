package DSA.LP3;

import java.util.*;

public class NQueens {

    // Function to print the board
    static void printBoard(int[][] board, int n) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    // Function to check if a queen can be safely placed at board[row][col]
    static boolean isSafe(int[][] board, int row, int col, int n) {

        // Check column above
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    // Recursive backtracking function
    static boolean solveNQueens(int[][] board, int row, int n) {
        // Base case: all queens placed
        if (row == n)
            return true;

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;

                // Recurse for next row
                if (solveNQueens(board, row + 1, n))
                    return true;

                // Backtrack
                board[row][col] = 0;
            }
        }

        // If no column worked, return false
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== N-Queens Solver Menu ===");
            System.out.println("1. Solve N-Queens Problem");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter size of board (n): ");
                    int n = sc.nextInt();

                    int[][] board = new int[n][n];
                    System.out.println("\nSolving " + n + "-Queens problem...\n");

                    if (solveNQueens(board, 0, n)) {
                        System.out.println("Final N-Queens Solution:");
                        printBoard(board, n);
                    } else {
                        System.out.println("No solution exists for n = " + n);
                    }
                }

                case 2 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 2);

        sc.close();
    }
}
