package seriousPracticeDSA.arraysQuestions;

import java.util.HashSet;
import java.util.Scanner;

public class Problem12_SubArray_With_Zero_Sum {


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
        System.out.println("Solution using O(N) approach: " + isSubArrayWith0Sum(arr));
    }


}
