package seriousPracticeDSA.recursionQuestions;

/*
 * Rope cutting problem
 * Given a rope of length N, and three cutting sizes of A, B & C. We need to find the maximum possible pieces we can cut.
 *
 * eg: I/P N = 5  A = 2, B = 5, C = 1
 *     O/P 5 (Pieces)
 */

import java.util.Scanner;

public class Problem3 {

    // Time Complexity: O(3^n)
    // This code can be optimized using DP
    static int maxRopeCut(int n, int a, int b, int c) {

        if (n == 0) return 0;
        if (n < 0) return -1;

        int max = Math.max(
                        maxRopeCut(n-a, a, b, c),
                Math.max(
                        maxRopeCut(n-b, a, b, c),
                        maxRopeCut(n-c, a, b, c)));

        if (max == -1) return -1;
        else return max + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter value of a, b, c (Space separated) ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum pieces possible: " + maxRopeCut(n, a, b, c));
    }

}
