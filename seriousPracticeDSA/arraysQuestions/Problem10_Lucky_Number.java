package seriousPracticeDSA.arraysQuestions;

/*
 * Check whether the given number is lucky number or not
 *
 * Lucky number is that for each iteration till N we need to kill/eliminate the counter position elements
 * and for each iteration counter increases
 *
 * eg: I/P: N = 13
 *     O/P: Yes 13 is lucky number
 *
 * Process:
 *  Step1: 1 2 3 4 5 6 7 8 9 10 11 12 13   counter = 2 (means every 2nd position element will be eliminated)
 *  Step2: 1 3 5 7 9 11 13   counter = 3 (means every 3rd position element will be eliminated)
 *  Step3: 1 3 7 9 13   counter = 4 (means every 4th position element will be eliminated)
 *  Step4: 1 3 7 13   counter = 5 (means every 5th position element will be eliminated, but here only 4 elements are
 *                                  so the remaining all elements are left so ""13 is LUCKY NUMBER"")
 *
 *  NOTE: Just remember the position of element not the actual element
 */

import java.util.Scanner;

public class Problem10_Lucky_Number {

    static boolean helper(int n, int counter) {

        if (counter > n) return true;

        if (n % counter == 0) return false;

        return helper((n - (n / counter)), counter + 1);
    }

    static boolean isLuckyNumber(int n) {
        return helper(n, 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        String s;
        if (isLuckyNumber(n)) s = " is Lucky Number";
        else s = " not a Lucky Number";

        System.out.println(n + s);
    }

}
