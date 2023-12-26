package algorithm.dynamic;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static final Map<Integer, Integer> numbers = new HashMap<>();

    public static void main(String[] args) {
        int n = 20;
        int answer = fibonacci(n);
        System.out.println(answer);
    }

    //Time complexity is O(n)
    //Space complexity is 0(n)
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (numbers.containsKey(n)) {
            return numbers.get(n);
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        numbers.put(n, result);
        return result;
    }
}
