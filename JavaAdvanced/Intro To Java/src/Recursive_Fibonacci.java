import java.util.Scanner;

public class Recursive_Fibonacci {
    private static long[] memo;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        memo = new long[n + 1];
        System.out.println(recursiveFibonacciWithMemoization(n));
    }
    private static long recursiveFibonacciWithMemoization(int n) {
        if (n <= 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] =
                recursiveFibonacciWithMemoization(n - 1) +
                        recursiveFibonacciWithMemoization(n - 2);
        return memo[n];
    }
}