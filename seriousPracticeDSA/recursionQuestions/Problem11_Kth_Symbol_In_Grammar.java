package seriousPracticeDSA.recursionQuestions;

/* Leetcode Question No. 779
 *
 * We need to generate the nth sequence as specified
 * Initially 1st row will be 0 and to generate next row we need to check previous row and replace
 * each 0 with 01 and each 1 with 10 to generate the next row
 *
 * eg: N = 3
 *     Sequence: 0  01  0110
 */

import java.util.Scanner;

public class Problem11_Kth_Symbol_In_Grammar {

    static String result;

    static void generate(String s, int n) {

        if (n == 1) {
            result = s;
            return;
        }
        System.out.println("Before 1st REPLACE_ALL use: " + s);
        s.replaceAll("0", "01");
        System.out.println("After 1st REPLACE_ALL use: " + s);
        s.replaceAll("1", "10");
        System.out.println("After 2nd REPLACE_ALL use: " + s);
        generate(s, n - 1);
    }

    public static void main(String[] args) {

        int n = 3;
        generate("01", n-1);

        System.out.println(result);
    }

}
