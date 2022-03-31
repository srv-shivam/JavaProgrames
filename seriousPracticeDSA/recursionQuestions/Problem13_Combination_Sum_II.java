package seriousPracticeDSA.recursionQuestions;

/*
 * Program to write all combinations possible to get a particular sum and each element must be picked only once
 *
 * eg: I/P: a[] = [10, 1, 2, 7, 6, 1, 5] Target = 8
 *     O/P: [1, 1, 6], [1, 2, 5], [1, 7], [2, 6]
 *
 * NOTE: Watch Striver's solution video for reference
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem13_Combination_Sum_II {

    static void findCombination(int[] arr, int target, int idx, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans) {

        if (target == 0) {
            Collections.sort(ds);
            if (!ans.contains(ds))
                ans.add(new ArrayList<>(ds));
            return;
        }

        if (idx == arr.length) return;

        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            findCombination(arr, target - arr[idx], idx + 1, ds, ans);
            ds.remove(ds.size() - 1);
        }
        findCombination(arr, target, idx + 1, ds, ans);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        findCombination(arr, target, 0, new ArrayList<>(), ans);

        for (ArrayList<Integer> val : ans) {
            System.out.println(val);
        }
    }

}
