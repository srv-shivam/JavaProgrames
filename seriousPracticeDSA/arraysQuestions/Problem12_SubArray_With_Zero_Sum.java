package seriousPracticeDSA.arraysQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem12_SubArray_With_Zero_Sum {

    static boolean subArrayWithKSum(int[] arr, int k) {

        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int val : arr) {
            set.add(sum);
            if (set.contains(k - sum)) return true;
            sum += val;
        }
        return false;
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    static boolean isSubArrayWith0Sum(int[] arr) {

        // array to store the cumulative sum of each array element
        int[] cumulativeSum = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
            cumulativeSum[i] = sum;
        }

        // Now we will use Hashset to check for duplicate cumulative sum
        HashSet<Integer> set = new HashSet<>();
        for (int val : cumulativeSum) {
            if (set.contains(val)) return true;
            if (val == 0) return true;
            set.add(val);
        }
        return false;
    }


    // Inefficient approach
    //
    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    static boolean isSubArray(int[] arr) {

        for (int i = 0; i < arr.length; ++i) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; ++j) {
                if (sum == 0) return true;
                sum += arr[j];
            }
        }
        return false;
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

        System.out.println("Solution using O(N^2) approach: " + isSubArray(arr));
        System.out.println("Solution using O(N) time and space approach: " + isSubArrayWith0Sum(arr));

        System.out.print("\n\nEnter value of k: ");
        int k = sc.nextInt();
        System.out.println("Solution using O(N) approach: " + subArrayWithKSum(arr, k));
    }


}
