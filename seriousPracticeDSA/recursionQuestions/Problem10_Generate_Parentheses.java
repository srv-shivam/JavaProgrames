package seriousPracticeDSA.recursionQuestions;

/*
 * Program to generate all combination of Parentheses for given value of N
 *
 * eg: I/P: N = 2
 *     O/P: ["(())", "()()"]
 *
 * Logic: Just remember one thing we just need to consider the equal number of opening and closing brackets
 *        Just follow the simple recursive rule that, this particular is added and ignored at particular level of tree
 *        and also take care that we cannot include more closing brackets, or we cannot include closing brackets
 *        previous to the opening brackets
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Problem10_Generate_Parentheses {

    static void generate(StringBuilder str, int open, int close) {

        if (open == 0 && close == 0) {
            System.out.println(str);
            return;
        }

        if (open > 0) {
            str.append("(");
            generate(str, open - 1, close);
            str.deleteCharAt(str.length() - 1);
        }

        if (close > 0) {
            if (open < close) {
                str.append(")");
                generate(str, open, close - 1);
                str.deleteCharAt(str.length() - 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.println("Possible combinations are: ");
        generate(new StringBuilder(""), n, n);
    }
}
