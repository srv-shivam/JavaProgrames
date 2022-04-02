package seriousPracticeDSA.recursionQuestions;

/*
 * We have to write a program to generate the possible strings formed when pressing a set of keys on Phone
 *
 * eg: I/P: str = "34"
 *     O/P: ["dg", "dh", "di", "eg", "eh", "ei", "fg", "fh", "fi"]
 *
 *     Explanation: Code for 3 -> def
 *                  Code for 4 -> ghi
 *     So, we need to just generate possible strings combining these digits strings
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem15_Phone_Number_Combination {

    static String[] keyPad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    static void solve(int idx, String digits, StringBuilder ds, ArrayList<String> ans) {

        if (idx == digits.length()) {
            ans.add(new String(ds));
            return;
        }

        int number = digits.charAt(idx) - '0'; // To get the current digit corresponding index
        String code = keyPad[number]; // To get the digits string from KEYPAD

        for (int i = 0; i < code.length(); ++i) {
            ds.append(code.charAt(i));
            solve(idx + 1, digits, ds, ans);
            ds.deleteCharAt(ds.length() - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter KEYPAD digits: ");
        String digits = sc.next();

        ArrayList<String> ans = new ArrayList<>();

        solve(0, digits, new StringBuilder(""), ans);

        System.out.println(ans);
    }

}
