package seriousPracticeDSA.recursionQuestions;

/*
 * Program to get the sum of digits of a number
 *
 * eg: I/P: 123
 *     O/P: 6 (1 + 2 + 3)
 */

import java.util.Scanner;
public class Problem2 {

    static int digitSum(int n) {

        if (n < 10) {
            return n;
        }
        return n%10 + digitSum(n/10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Sum of digits is : " + digitSum(n));
    }
}
