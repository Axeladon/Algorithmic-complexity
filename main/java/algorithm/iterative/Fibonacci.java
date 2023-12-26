package algorithm.iterative;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int answer = fibonacci(n);
        System.out.println(answer);
    }

    //Time complexity is O(n)
    //Space complexity is 0(1)
    private static int fibonacci(int n) {
        if (n <= 1)
            return n;

        int fib1 = 0;
        int fib2 = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
        }
        return result;
    }
}
