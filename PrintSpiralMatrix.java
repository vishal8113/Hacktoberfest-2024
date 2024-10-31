import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int n) {
        // Define the boundaries for traversal in the 2D array
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int counter = 1; // Initialize counter to populate the array with values from 1 to n^2

        // Initialize an n x n matrix to store numbers in a spiral order
        int[][] arr = new int[n][n];

        // Loop until the counter reaches n^2 (we've filled the entire matrix)
        while (counter <= (n * n)) {
            // Traverse from left to right on the top row
            for (int i = left; i <= right; i++) {
                arr[top][i] = counter++;
            }
            top++; // Move the top boundary down

            // Traverse from top to bottom on the rightmost column
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = counter++;
            }
            right--; // Move the right boundary left

            // Traverse from right to left on the bottom row (if bottom row is still valid)
            for (int i = right; i >= left; i--) {
                arr[bottom][i] = counter++;
            }
            bottom--; // Move the bottom boundary up

            // Traverse from bottom to top on the leftmost column (if left column is still valid)
            for (int i = bottom; i >= top; i--) {
                arr[i][left] = counter++;
            }
            left++; // Move the left boundary right
        }

        // Initialize the ArrayList to hold the 2D spiral order matrix
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Convert 2D array to an ArrayList of ArrayLists
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> rowList = new ArrayList<>(); // Temporary list to hold each row
            for (int j = 0; j < arr[0].length; j++) {
                rowList.add(arr[i][j]); // Add each element in the row to the list
            }
            list.add(rowList); // Add each row list to the final list
        }

        // Return the final spiral order matrix as an ArrayList of ArrayLists
        return list;
    }
}
