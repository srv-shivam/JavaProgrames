package recursion;

import java.util.Scanner;

public class FibonacciNumber {

    static int nthFibonacciNumber(int n) {

        //base case
        if (n == 0 || n == 1) return n;

        // recursive call
        return nthFibonacciNumber(n - 1) + nthFibonacciNumber(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = nthFibonacciNumber(n);
        System.out.println(n + "th Fibonacci Number : " + result);
    }
}
