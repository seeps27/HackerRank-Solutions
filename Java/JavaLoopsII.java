import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of queries

        for (int q = 0; q < t; q++) {
            int a = sc.nextInt();  // Starting number
            int b = sc.nextInt();  // Multiplier
            int n = sc.nextInt();  // Length of series

            int sum = a;  // Initial value of sum is a

            for (int i = 0; i < n; i++) {
                sum += (int) Math.pow(2, i) * b;
                System.out.print(sum + " ");
            }
            System.out.println();  // New line after each series
        }

        sc.close();
    }
}
