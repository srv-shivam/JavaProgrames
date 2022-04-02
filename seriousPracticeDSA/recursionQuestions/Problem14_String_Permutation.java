package seriousPracticeDSA.recursionQuestions;

/*
 * Program to generate all the permutations of the given string
 *
 * eg: I/P:  s = "ABC"
 *     O/P:  "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
 */

import java.util.Scanner;

public class Problem14_String_Permutation {

    static void swap(StringBuilder str, int i, int j) {
        char ch = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, ch);
    }

    //LOGIC:  Basic logic behind is we are just swapping each element accordingly, we are giving
    //        each character chance to start with first position and generating permutation accordingly
    //
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    static void generatePermutations2(int idx, StringBuilder str) {

        if (idx == str.length()) {
            System.out.println(str);
            return;
        }

        for (int i = idx; i < str.length(); ++i) {
            swap(str, i, idx);
            generatePermutations2(idx + 1, str);
            swap(str, i, idx);
        }
    }


    // Time Complexity: O(N! * N)
    // Space Complexity: O(N) + O(N) {Depth of recursion + Auxiliary space flag}
    //
    // NOTE: I have used flag as check for the elements which I have selected till that particular depth of recursion
    static void generatePermutations1(String str, StringBuilder per, boolean[] flag) {

        if (per.length() == str.length()) {
            System.out.println(per);
            return;
        }

        for (int i = 0; i < str.length(); ++i) {
            if (!flag[i]) {
                flag[i] = true;
                per.append(str.charAt(i));
                generatePermutations1(str, per, flag);
                flag[i] = false;
                per.deleteCharAt(per.length() - 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();

        boolean[] flag = new boolean[str.length()];

        generatePermutations1(str, new StringBuilder(""), flag);

        System.out.println("\nUsing Second optimized method ");
        generatePermutations2(0, new StringBuilder(str));
    }
}
