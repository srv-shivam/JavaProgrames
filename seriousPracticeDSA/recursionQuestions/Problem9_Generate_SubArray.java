package seriousPracticeDSA.recursionQuestions;

/*
 * Program to generate sub-array of the given array
 * <p>
 * eg: I/P: [4 2 -3 1 6]
 * O/P: [4] [4 2] [4 2 -3] [4 2 -3 1] [4 2 -3 1 6]
 * [2] [2 -3] [2 -3 1]  [2 -3 1 6]
 * [-3] [-3 1] [-3 1 6]
 * [1] [1 6]
 * [6]
 */

import java.util.ArrayList;
import java.util.List;

public class Problem9_Generate_SubArray {

    static List<List<Integer>> allSubsets = new ArrayList<>();
    ;

    static void generateSubArray(int[] arr, int i, List<Integer> subArray) {

        if (i == arr.length) {
            allSubsets.add(new ArrayList<>(subArray));
            return;
        }

        generateSubArray(arr, i + 1, subArray);
        subArray.add(arr[i]);
        generateSubArray(arr, i + 1, subArray);
        subArray.remove(subArray.size() - 1);
    }

    public static void main(String[] args) {

        generateSubArray(new int[]{1, 2, 3}, 0, new ArrayList<>());
        System.out.println(allSubsets);
    }

}
