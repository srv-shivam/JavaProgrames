package seriousPracticeDSA.recursionQuestions;

/*
 * Program to count the number of subsets whose sum is equal to the given sum
 *
 * eg: I/P: [10, 20, 15] SUM: 25
 *     O/P: 1 [10, 15]
 */

import java.util.Scanner;

public class Problem8_Count_Of_Subsets_With_Sum_Equal_To_K {

    static int countOfSubsetSum(int[] arr, int n, int sum, int subSetSum) {

        if (n == 0) {
            if (sum == subSetSum)
                return 1;
            return 0;
        }

        return countOfSubsetSum(arr, n-1, sum, subSetSum) + countOfSubsetSum(arr, n-1, sum, subSetSum+arr[n-1]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter sum: ");
        int sum = sc.nextInt();

        int count = countOfSubsetSum(arr, n, sum, 0);

        System.out.println("Count : " + count);
    }

}
