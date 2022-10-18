package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacci(10));
    }

    private static long getFibonacci(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
            return arr[n];
    }
}
