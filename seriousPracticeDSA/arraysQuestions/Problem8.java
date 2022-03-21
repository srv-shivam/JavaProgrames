package seriousPracticeDSA.arraysQuestions;

/*
 * Program to move all zeroes to the end of the array
 *
 * eg: I/P: 4 0 0 2 0 6 0
 *     O/P: 4 2 6 0 0 0 0
 */

import java.util.Scanner;

public class Problem8 {

    // Time Complexity O(N)
    // Space Complexity O(1)
    // Order of the elements are maintained in this solution
    static void moveZeroes(int[] arr) {

        // Maintaining count to keep track of the non-zero elements
        int count = 0;

        for (int i=0; i<arr.length; ++i) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                ++count;
            }
        }
    }

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    // Order of the elements are effected in this solution
    static void moveAllZeroes(int[] arr) {

        int i=0, j=arr.length-1;
        while(i<j) {
            if (arr[i] != 0) ++i;
            if (arr[j] == 0) --j;

            if (arr[i] == 0 && arr[j] > 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                ++i; --j;
            }
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

//        moveAllZeroes(arr);
          moveZeroes(arr);

        System.out.print("Modified array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

}
