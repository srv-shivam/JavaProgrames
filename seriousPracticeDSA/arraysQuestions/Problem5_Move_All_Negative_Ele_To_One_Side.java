package seriousPracticeDSA.arraysQuestions;

/*
 * Move all the negative elements to one side of the array
 *
 * eg: I/P: 2 -12 8 3 -1 -4 5
 *     O/P: -12 -1 -4 2 8 3 5 (NOTE: Order of element does not matter)
 */

import java.util.Scanner;

public class Problem5_Move_All_Negative_Ele_To_One_Side {


    // If we care about the sequence of all the elements whether it is positive or negative element
    // this is the logic to implement such case
    //
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    static void move(int[] arr) {

        int count = 0;
        int j = 0;
        int[] neg = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {

            // negative element found
            if (arr[i] < 0) {
                neg[j++] = arr[i];
            }
            if (arr[i] > -1) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count++] = temp;
            }
        }

        j += count;
        for (int i = count, k = 0; i < j; ++i, ++k) {
            arr[i] = neg[k];
        }
    }

    // This is the logic when we only care about the positive elements sequences
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    static void arrange(int[] arr, int n) {

        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] < 0) ++i;
            if (arr[j] >= 0) ++j;

            if (arr[i] < 0 && arr[j] < 0) ++i;
            if (arr[i] > 0 && arr[j] > 0) --j;

            if (arr[i] > 0 && arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                ++i;
                --j;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

//        arrange(arr, n);
        move(arr);

        System.out.print("Arranged array: ");
        for (int val : arr) System.out.print(val + " ");
    }


}
