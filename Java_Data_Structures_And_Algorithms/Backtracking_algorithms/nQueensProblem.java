//Problem Statement -
//The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
//Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
//Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

import java.util.*;

public class nQueensProblem {
    public static boolean isSafe(int row, int col, char[][] board) {
        //horizontal
        for(int j = 0; j < board.length; j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }

        //vertical
        for(int i = 0; i < board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //upper left
        int r = row;
        for(int c = col; c>=0 && r>=0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //upper right
        r = row;
        for(int c = col; c<board.length && r>=0; r--, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower left
        r = row;
        for(int c = col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower right
        r = row;
        for(int c = col; c<board.length && r<board.length; r++, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i = 0; i < board.length; i++) {
            row = "";
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col) {
        if(col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for(int row = 0; row < board.length; row++) {
            if(isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }

    public static void printSolutions(List<List<String>> allBoards) {
        for(int i = 0; i < allBoards.size(); i++) {
            System.out.print(allBoards.get(i));
            System.out.println();
        }
    }
    
    public static void solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        printSolutions(allBoards);
    }

    public static void main(String[] args) {
        int n = 4;
        solveNQueens(n);
    }
}