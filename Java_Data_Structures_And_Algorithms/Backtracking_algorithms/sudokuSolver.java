/*Q- Write a program to solve a Sudoku puzzle by filling the empty cells.
A sudoku solution must satisfy all of the following rules:
Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.
*/

import java.util.*;

public class sudokuSolver {
    public static boolean isSafe(char[][] board, int row, int col, int number) {
        //Horizontal or vertical
        for(int i = 0; i < board.length; i++) {
            //Vertical
            if(board[i][col] == (char)(number + '0')) {
                return false;
            }
            //Horizontal
            if(board[row][i] == (char)(number + '0')) {
                return false;
            }
        }

        //grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        
        for(int i = sr; i < sr+3; i++) {
            for(int j = sc; j < sc+3; j++) {
                if(board[i][j] == (char)(number + '0')) {
                    return false;
                }
            }
        }

        return true;
    }
    public static boolean helper(char[][] board, int row, int col) {
        if(row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;
        if(col != board.length - 1) {
            ncol = col + 1;
            nrow = row;
        } else {
            ncol = 0;
            nrow = row + 1;
        }

        if(board[row][col] != '.') {
            if(helper(board, nrow, ncol)) {
                return true;
            }
        } else {
            //trying to fill the space
            for(int i = 1; i <= 9; i++) {
                if(isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if(helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        char[][] board = new char[9][9];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you sudoku puzzle :");
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        sc.close();

        helper(board, 0, 0);

        //Printing the solved Sudoku
        System.out.println();
        System.out.println("Printing the solved Sudoku :");
        System.out.println();
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}