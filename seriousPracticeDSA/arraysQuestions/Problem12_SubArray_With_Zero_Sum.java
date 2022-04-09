package seriousPracticeDSA.arraysQuestions;

import java.util.Scanner;

public class Problem12_SubArray_With_Zero_Sum {

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

        System.out.println(isSubArray(arr));
    }


}
