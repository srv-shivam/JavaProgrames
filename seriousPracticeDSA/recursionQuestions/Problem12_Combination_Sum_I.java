package seriousPracticeDSA.recursionQuestions;

/*
 * Program to Print all the combinations of array elements which can form the sum as the target sum
 *
 * eg: I/P: arr[] = [7, 2, 6, 5] Target = 16
 *     O/P: [2, 2, 2, 2, 2, 2, 2, 2], [2, 2, 2, 2, 2, 6], [2, 2, 2, 5, 5], [2, 2, 5, 7], [2, 7, 7] [5, 5, 6]
 * NOTE: We can take any element multiple times
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem12_Combination_Sum_I {

    static void findCombination(int[] arr, int target, int idx, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        if (idx == arr.length) {
            return;
        }

        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            findCombination(arr, target - arr[idx], idx, ds, ans);
            ds.remove(ds.size() - 1);
        }
        findCombination(arr, target, idx + 1, ds, ans);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        System.out.print("Enter elements: ");
        int[] arr = new int[n];

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
