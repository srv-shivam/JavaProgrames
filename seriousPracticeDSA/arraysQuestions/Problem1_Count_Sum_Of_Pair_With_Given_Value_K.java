package seriousPracticeDSA.arraysQuestions;

/*
 * Count/Find A Pair of numbers in array with given value K
 */

import java.util.*;

public class Problem1_Count_Sum_Of_Pair_With_Given_Value_K {

    // Time Complexity: O(N)
    // Space Complexity: O(N) (Used map)
    static void findPairCount(int[] arr, int n, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int val : arr) {
            int temp = k - val;

            if (map.containsKey(temp)) {
                count += map.get(temp);
            }

            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }
        System.out.println("Count is: " + count);
    }

    // Time Complexity: O(N^2) solution
    // Space Complexity: O(1)
    static void countPair(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((arr[j] < k) && (arr[i] + arr[j]) == k) {
                    ++count;
                    System.out.println("Pair:" + count + " => " + arr[i] + " " + arr[j]);
                }
            }
        }
        System.out.println("Total count of Pair : " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int n = sc.nextInt();

        System.out.print("Enter elements : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter vale K : ");
        int k = sc.nextInt();

        countPair(arr, n, k);
        System.out.println("Using Map: ");
        findPairCount(arr, n, k);
    }
}
