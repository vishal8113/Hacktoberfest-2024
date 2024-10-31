import java.lang.*;
import java.util.*;

public class PrintDiagonalElements {
    public static void main(String[] args) {
        // Taking input for the matrix dimensions
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of rows
        int m = sc.nextInt(); // number of columns
        int[][] C = new int[n][m];

        // Taking input for the matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i][j] = sc.nextInt();
            }
        }

        // Printing diagonals starting from the first row
        for (int col = 0; col < m; col++) {
            int r = 0; // Start from the first row
            int c = col; // Current column
            while (r < n && c >= 0) {
                System.out.print(C[r][c] + " ");
                r++; // Move down
                c--; // Move left
            }
        }

        // Printing diagonals starting from the second row of the first column
        for (int row = 1; row < n; row++) {
            int r = row; // Current row
            int c = m - 1; // Start from the last column
            while (r < n && c >= 0) {
                System.out.print(C[r][c] + " ");
                r++; // Move down
                c--; // Move left
            }
        }

        System.out.println(); // For a newline after printing all diagonals
    }
}
