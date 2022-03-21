package seriousPracticeDSA.arraysQuestions;

/*
 * Program to count inversions in an array
 *
 * Rule for inversion ->  {i<j and arr[i] > arr[j]}
 *
 * eg: I/P: 9 6 8 4
 *     O/P: 5
 *
 */

import java.util.Scanner;

public class Inversion_To_Complete_Problem9 {

    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    // Brute force method
    static int countInversion(int[] arr) {

        int count = 0;
        for (int i=0; i<arr.length; ++i) {

            for (int j=i+1; j< arr.length; ++j) {
                if (arr[i] > arr[j]) ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i=0; i<n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Total inversions: " + countInversion(arr));
    }
}
