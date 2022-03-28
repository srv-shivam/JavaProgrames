package seriousPracticeDSA.arraysQuestions;

/*
 * Program to remove duplicate elements in sorted Array
 * eg: I/P: 1 2 2 3 4 5
 *     O/P: 1 2 3 4 5
 */

import java.util.Scanner;

public class Problem4_Remove_Duplicate_Elements_In_Sorted_Array {

    // Time Complexity: O(N)
    // Space Complexity: O(N)
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

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    static void removeDuplicate2(int[] arr) {

        int pos = 1;
        int curr = arr[0];

        for (int i=1; i<arr.length; ++i) {
            if (arr[i] != curr) {
                curr = arr[i];
                arr[pos++] = curr;
            }
        }

        System.out.print("\nSolution with 2nd method: ");
        for (int i=0; i< pos; ++i) {
            System.out.print(arr[i] + " ");
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
        removeDuplicate2(arr);
    }
}
