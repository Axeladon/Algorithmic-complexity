package algorithm.recursive;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 7;
        int answer = fibonacci(num);
        System.out.println(answer);
    }

    //Time complexity is O(2^n)
    //Space complexity is 0(n)
    private static int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
