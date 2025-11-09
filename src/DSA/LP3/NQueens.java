package DSA.LP3;

import java.util.*;

public class NQueens {
    static void printBoard (int [][] board, int n){
        for(int [] row : board) {
            for (int cell : row) {
                System.out.println((cell == 1 ? "Q " : "."));
            }
            System.out.println();
        }
    }

    static boolean isSafe(int [][] board, int row, int col, int n){
        // check  this column on upper side
        for(int i = 0; i<n; i++){
            if(board[i][col] == 1){
                return false;
            }
        }
        // check upper-left diagonal
        for(int i = row-1, j = col-1 ; i >= 0 && j >= 0 ; i--, j--){
            if(board[i][j] == 1){
                return false;
            }
        }

        // check upper-right diagonal
        for(int i = row-1, j = col+1 ; i >= 0 && j >= 0 ; i--, j++){
            if(board[i][j] == 1){ return false; }
        }

        return true;
    }

    // backtracking function
    static boolean solveNQueens(int [][] board, int row, int n){
        if(row == n) return true; // all queens are placed

        for(int col = 0; col < n; col++){
            if(board[row][col] == 0 && isSafe(board, row, col, n)){
                board[row][col] = 1;
                if(solveNQueens(board, row+1, n)) return true;
                board[row][col] = 0;
            }
        }
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

                    System.out.print("Enter row index (0 to " + (n - 1) + ") for first Queen: ");
                    int r = sc.nextInt();
                    System.out.print("Enter column index (0 to " + (n - 1) + ") for first Queen: ");
                    int c = sc.nextInt();

                    if (r < 0 || r >= n || c < 0 || c >= n) {
                        System.out.println("Invalid position!");
                        break;
                    }

                    board[r][c] = 1; // Place the first queen

                    System.out.println("\nInitial Board with first Queen:");
                    printBoard(board, n);

                    // Try solving starting from next row
                    if (solveNQueens(board, 0, n)) {
                        System.out.println("\nFinal N-Queens Solution:");
                        printBoard(board, n);
                    } else {
                        System.out.println("No solution exists for this configuration.");
                    }
                }
                case 2 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 2);

        sc.close();
    }
}
