import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int[] result = arrayZeroSum(n);
        System.out.println("Array with zero sum: " + Arrays.toString(result));
        scanner.close();
    }
    public static int[] arrayZeroSum(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("Invalid input. The number should be from 1 to 100");
        }
        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            result[i] = i + 1;
            sum += result[i];
        }
        result[n - 1] = -sum;
        return result;
    }
}