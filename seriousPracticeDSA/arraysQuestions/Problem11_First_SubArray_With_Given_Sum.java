package seriousPracticeDSA.arraysQuestions;

/*
 * Program to find the first sub-array whose sum is equal to the given sum
 *
 * eg: I/P: a[] = [1, 2, 3, 7, 5] Sum = 12
 *     O/P: [2, 4] {Array element from position 2 to 4 sum up to the given sum. i.e 2+3+7 = 12}
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11_First_SubArray_With_Given_Sum {

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    //
    // LOGIC: Try to implement like sliding window concept, put pointer i and pointer j as the boundaries
    //        of the window and try to increase the window side until we get the given sum but if elements
    //        can't be added further decrease the window from start (i.e i) and add it back to the sum.
    static ArrayList<Integer> findSubArray1(int[] arr, int sum) {

        ArrayList<Integer> ans = new ArrayList<>();
        int temp = sum;
        int i = 0, j = 0;

        while ((i < arr.length) && (j < arr.length)) {

            if (arr[j] <= temp) {
                temp -= arr[j];
                ++j;
            } else {
                temp += arr[i];
                ++i;
            }

            if (temp == 0) {
                ans.add(i + 1);
                ans.add(j);
                return ans;
            }
        }
        // if the sub-array not found with given sum
        ans.add(-1);
        return ans;
    }

    // Time Complexity: O(N^2)
    // Space Complexity: O(1)
    static ArrayList<Integer> findSubArray(int[] arr, int sum) {

        ArrayList<Integer> ans = new ArrayList<>();
        int temp;
        for (int i = 0; i < arr.length; ++i) {
            temp = sum;
            for (int j = i; j < arr.length; ++j) {
                if (temp < arr[j])
                    break;
                temp -= arr[j];

                if (temp == 0) {
                    ans.add(i + 1);
                    ans.add(j + 1);
                    return ans;
                }
            }
        }
        // if sub-array not found of given sum
        ans.add(-1);
        return ans;
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

        System.out.print("Enter sum: ");
        int sum = sc.nextInt();

        System.out.println("SubArray is: " + findSubArray(arr, sum));
        System.out.println("SubArray is: " + findSubArray1(arr, sum));

    }

}
