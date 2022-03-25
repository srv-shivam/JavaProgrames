package seriousPracticeDSA.recursionQuestions;

/*
 * Program to generate all the subsets of the given string
 *
 * eg: I/P: "ABC"
 *     O/P: "A" "B" "C" "AB" "AC" "BC" "ABC"
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {

    // This arrayList is used to remove the duplicate subsets to be considered
    // Time Complexity: O(2^N-1)
    // Space Complexity: O(N)
    static ArrayList<String> subSet = new ArrayList<>();

    static void generateSubSets(String str, int idx, String subSets) {

        if (idx == str.length()) {

            if (subSet.contains(subSets)) return;

            subSet.add(subSets);
            System.out.print(subSets +  " ");
            return;
        }

        generateSubSets(str, idx + 1, subSets);
        generateSubSets(str, idx + 1, subSets + str.charAt(idx));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();

        generateSubSets(str, 0, "");
    }
}
