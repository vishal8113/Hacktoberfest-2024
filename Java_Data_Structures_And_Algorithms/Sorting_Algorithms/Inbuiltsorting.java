import java.util.Arrays;

public class Inbuiltsorting {
    public static void printresult(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(numbers);
        printresult(numbers);
    }
}