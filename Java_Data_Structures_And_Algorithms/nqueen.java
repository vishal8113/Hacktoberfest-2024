// Here's the Java code for solving the N-Queens problem using backtracking
public class NQueens {

    // Function to print the solution
    public static void printSolution(int[][] board, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    // Function to check if a queen can be placed on board[row][col]
    public static boolean isSafe(int[][] board, int row, int col, int N) {
        // Check the same column on the upper side
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Function to solve the N-Queens problem using backtracking
    public static boolean solveNQueens(int[][] board, int row, int N) {
        if (row >= N) {
            return true; // All queens are placed
        }

        // Try placing the queen in all columns in the current row
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col, N)) {
                // Place the queen
                board[row][col] = 1;

                // Recursively place the rest of the queens
                if (solveNQueens(board, row + 1, N)) {
                    return true;
                }

                // If placing the queen in board[row][col] doesn't lead to a solution,
                // then backtrack and remove the queen
                board[row][col] = 0;
            }
        }

        return false; // No place was safe for this row
    }

    // Driver code
    public static void main(String[] args) {
        int N = 8; // You can change the size of the board here
        int[][] board = new int[N][N];

        if (solveNQueens(board, 0, N)) {
            printSolution(board, N);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
