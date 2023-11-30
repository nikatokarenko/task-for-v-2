import java.util.Arrays;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        if (n < 0 || n > 10000) {
            throw new IllegalArgumentException("Invalid input. The number should be from 0 to 10000");
        }
        LargestNumberInFamily(n);
        scanner.close();
    }
    public static void LargestNumberInFamily(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        Arrays.sort(digits);
        System.out.println("For " + n + ", the largest number in the family is: " + parseInt(reverseArray(digits)));
    }
    private static char[] reverseArray(char[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return arr;
    }
    private static int parseInt(char[] arr) {
        return Integer.parseInt(new String(arr));
    }
}