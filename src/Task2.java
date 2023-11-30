import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array, separated by space:");
        int[] Array = new int[size];
        for (int i = 0; i < size; i++) {
            Array[i] = scanner.nextInt();
        }
        System.out.println("The sum of the numbers in the array is: " + calcSumArray(Array));
        scanner.close();
    }
    public static int calcSumArray(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}