import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Read the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the largest element
        int largest = arr[0]; // Assume the first element is the largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);

        // Close the scanner
        sc.close();
    }
}
