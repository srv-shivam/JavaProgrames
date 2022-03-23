package seriousPracticeDSA.recursionQuestions;

/*
 * Program to check a number is Palindrome or not using recursion
 */

import java.util.Scanner;

public class Problem1 {

    private static int helper(int n, int rev) {

        if (n == 0) {
            return rev;
        } else {
            return helper(n/10, rev*10+n%10);
        }

    }

    static boolean isPaling(int n) {
        return helper(n, 0) == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isPaling(n)) System.out.println("Yes! Palindrome");
        else System.out.println("Not a Palindrome");
    }

}
