package seriousPracticeDSA.arraysQuestions;

/*
 * Program to remove duplicate elements in sorted Array
 * eg: I/P: 1 2 2 3 4 5
 *     O/P: 1 2 3 4 5
 */

import java.util.Scanner;

public class Problem4 {

    static void removeDuplicate(int[] arr) {

        int curr = arr[0];
        int[] ans = new int[arr.length];

        ans[0] = curr;
        int count = 1;

        for (int i=1; i<arr.length; ++i) {
            if (curr != arr[i]) {
                ans[count++] = arr[i];
                curr = arr[i];
            }
        }

        for (int i=0; i<count; ++i) {
            System.out.print(ans[i] + " ");
        }
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

        removeDuplicate(arr);
    }
}
