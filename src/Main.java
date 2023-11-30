import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number ");
        int n = scanner.nextInt();
        String result = pattern(n);
        System.out.println("Result: " + result);
        scanner.close();
    }
    public static String pattern(int n) {
        StringBuilder pattern = new StringBuilder();
        for (int i = 0; i < n; i++) {
            pattern.append(i % 2 == 0 ? '+' : '-');
        }
        return pattern.toString();
    }
}